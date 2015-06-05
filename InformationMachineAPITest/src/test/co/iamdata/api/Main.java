package test.co.iamdata.api;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import co.iamdata.api.APIException;
import co.iamdata.api.controllers.*;
import co.iamdata.api.models.*;

public class Main {

	public static void main(String[] args) {
		try {
			List<String> config = Files.readAllLines(Paths.get("clienttest.txt"), Charset.defaultCharset());
			String clientId = config.get(0);
			String clientSecret = config.get(1);
			String supermarketName = config.get(2);
			String username = config.get(3);
			String password = config.get(4);
			
			Integer superMarketId = LookupControllerTest(new LookupController(clientId, clientSecret), supermarketName);
			ProductsController productsController = new ProductsController(clientId, clientSecret);

			ProductsControllerTest(productsController);

			TestUserPurchase(productsController, clientId, clientSecret, superMarketId, username, password);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (APIException e) {
				e.printStackTrace();
		} catch (APITestException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void TestUserPurchase(ProductsController productsController, String clientId, String clientSecret, int superMarketId, String username, String password) throws APITestException, JsonProcessingException, IOException, APIException, InterruptedException
    {
        String email = "testuser@iamdata.co";
        String userId = "testuserId1234";

        UserManagementController usersController = new UserManagementController(clientId, clientSecret);
        UserStoresController storesController = new UserStoresController(clientId, clientSecret);
        UserPurchasesController purchasesController = new UserPurchasesController(clientId, clientSecret);
        UserScansController userScansController = new UserScansController(clientId, clientSecret);

        UsersControllerTest(email, usersController, userId);

        String encodedImage = new String(Files.readAllBytes(Paths.get("encoded_logo.txt")), Charset.defaultCharset());
        String receiptId = "fe6ba83b-d45c-457a-afd5-35bdb3cdffff";
        UploadReceiptRequest receiptRequest = new UploadReceiptRequest();
        receiptRequest.setImage(encodedImage);
        receiptRequest.setReceiptId(receiptId);
        
        userScansController.userScansUploadReceipt(receiptRequest, userId);

        ConnectUserStoreRequest storeConnect = new ConnectUserStoreRequest();
        storeConnect.setStoreId(superMarketId);
        storeConnect.setUsername(username);
        storeConnect.setPassword(password);
        
        ConnectUserStoreResponse userStore = storesController.userStoresConnectStore(storeConnect, userId).getResult();

        Boolean storeConnectionValid = checkStoreValidity(storesController, userId, userStore.getId());
        if (!storeConnectionValid)
        {
            storesController.userStoresDeleteSingleStore(userId, userStore.getId());
            throw new APITestException("Error: could not connect to store");
        }

        UpdateUserStoreRequest updateUserStoreRequest = new UpdateUserStoreRequest();
        updateUserStoreRequest.setUsername(username);
        updateUserStoreRequest.setPassword(password);

        storesController.userStoresUpdateStoreConnection(updateUserStoreRequest, userId, userStore.getId());

        if (!waitForScrapeToFinish(storesController, userId, userStore.getId()))
        {
            throw new APITestException("Error: scrape is not finished");
        }

        List<UserStore> stores = storesController.userStoresGetAllStores(userId, 1, 10).getResult();
        if (stores.size() == 0 || stores.get(0).getId() <= 0)
        {
            throw new APITestException("Error: could not get all stores");
        }

        List<ProductData> userProducts = productsController.productsGetUserProducts(userId, 1, 15, true, true).getResult();
        if (userProducts.size() == 0)
        {
            throw new APITestException("Error: get user products");
        }

        List<UserPurchase> userPurchases = purchasesController.userPurchasesGetAllUserPurchases(userId, 1, 15, true).getResult();
        if (userPurchases.size() == 0)
        {
            throw new APITestException("Error: get all user purchases");
        }

        UserPurchase userPurchase = purchasesController.userPurchasesGetSingleUserPurchase(userId, userPurchases.get(0).getId().toString(), true).getResult();
        if (userPurchase == null || !userPurchase.getId().equals(userPurchases.get(0).getId()))
        {
            throw new APITestException("Error: get single user purchases");
        }

        UploadBarcodeRequest barcodeRequest = new UploadBarcodeRequest();
        barcodeRequest.setBarCode("021130126026");
        barcodeRequest.setBarCodeType("UPC-A");
        
        UploadBarcodeResponse barcodeResponse = userScansController.userScansUploadBarcode(barcodeRequest, userId).getResult();
        if (!barcodeResponse.getBarCodeType().equals("UPC-A") || !barcodeResponse.getBarCode().equals("021130126026"))
        {
            throw new APITestException("Error: upload barcode");
        }

        storesController.userStoresDeleteSingleStore(userId, userStore.getId());

        usersController.userManagementDeleteUser(userId);
    }

	private static Boolean waitForScrapeToFinish(
			UserStoresController storesController, String userIdentifier,
			int storeId) throws IOException, APIException, InterruptedException {
		// try to see if the users credentials are valid
		for (int i = 0; i < 30; i++) {
			GetSingleStoresWrapper connectedStore = storesController.userStoresGetSingleStore(
					userIdentifier, storeId);

			if (connectedStore != null
					&& connectedStore.getResult().getScrapeStatus().equals("Done")) {
				return true;
			}

			Thread.sleep(3000);
		}

		return false;
	}

	private static Boolean checkStoreValidity(UserStoresController storesController,
			String userIdentifier, Integer storeId) throws IOException, APIException, InterruptedException {
		// try to see if the users credentials are valid
		for (int i = 0; i < 15; i++) {
			GetSingleStoresWrapper connectedStore = storesController.userStoresGetSingleStore(
					userIdentifier, storeId);

			if (connectedStore != null){
				if(connectedStore.getResult().getCredentialsStatus().equals("Verified")) {
					return true;
				}
				if(connectedStore.getResult().getCredentialsStatus().equals("Invalid")) {
					return false;
				}
			}

			Thread.sleep(3000);
		}

		return false;
	}

	private static void UsersControllerTest(String email, UserManagementController usersController, String userId) throws APITestException, JsonProcessingException, IOException, APIException
    {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setEmail(email);
        registerUserRequest.setUserId(userId);
        registerUserRequest.setZip("21000");

        CreateUserWrapper user = usersController.userManagementCreateUser(registerUserRequest);

        if (!user.getResult().getEmail().equals(email) || !user.getResult().getUserId().equals(userId))
        {
            throw new APITestException("Error: create user");
        }

        GetAllUsersWrapper allUsers = usersController.userManagementGetAllUsers(1, 10);

        if (allUsers.getResult().size() == 0)
        {
            throw new APITestException("Error: get all users");
        }

        GetSingleUserWrapper userResponse = usersController.userManagementGetSingleUser(userId);
        if (!userResponse.getResult().getEmail().equals(email))
        {
            throw new APITestException("Error: get single user");
        }
    }

	private static int LookupControllerTest(LookupController lookupController,
			String supermarketName) throws APITestException, IOException, APIException {
		int superMarketId = 0;

		List<CategoryInfo> categories = lookupController.lookupGetCategories().getResult();
		if (categories.size() == 0 || !categories.get(0).getId().equals(1)) {
			throw new APITestException("Error: categories");
		}

		List<NutrientInfo> nutrients = lookupController.lookupGetNutrients().getResult();
		if (nutrients.size() == 0 || !nutrients.get(0).getId().equals(7)) {
			throw new APITestException("Error: nutrients");
		}

		List<ProductAlternativeTypeInfo> alternatives = lookupController.lookupGetProductAlternativeTypes().getResult();
		if (alternatives.size() == 0 || !alternatives.get(0).getId().equals(1)
				|| !alternatives.get(0).getName().equals("Reduce Sodium")) {
			throw new APITestException("Error: alternatives");
		}

		List<TagInfo> tags = lookupController.lookupGetTags().getResult();
		if (tags.size() == 0 || !tags.get(0).getId().equals(29) || !tags.get(0).getName().equals("Low Fat")) {
			throw new APITestException("Error: tags");
		}

		List<UOMInfo> unitsOfMeasurement = lookupController.lookupGetUOMs().getResult();
		if (unitsOfMeasurement.size() == 0 || !unitsOfMeasurement.get(0).getId().equals(1)
				|| !unitsOfMeasurement.get(0).getName().equals("g")) {
			throw new APITestException("Error: units of measurements");
		}

		List<StoreInfo> stores = lookupController.lookupGetStores().getResult();
		if (stores.size() == 0 || !stores.get(0).getId().equals(1)
				|| !stores.get(0).getName().equals("FreshDirect")) {
			throw new APITestException("Error: stores");
		}

		for (int i = 0; i < stores.size(); i++) {
			if (stores.get(i).getName().equals(supermarketName)) {
				superMarketId = stores.get(i).getId();
				break;
			}
		}

		return superMarketId;
	}

	private static void ProductsControllerTest(
			ProductsController productsController) throws APITestException, IOException, APIException {
		List<ProductData> kaleProducts = productsController.productsSearchProducts("Kale", null, 1, 25, null, true).getResult();
		if (kaleProducts.size() == 0 || kaleProducts.get(0).getName() == null) {
			throw new APITestException("Error: get products");
		}

		String kaleName = kaleProducts.get(0).getNutrients().get(0).getName();
		if (kaleName == null || kaleName.isEmpty()) {
			throw new APITestException("Error: get detail product info");
		}

		List<ProductData> secondPageKaleProducts = productsController.productsSearchProducts("Kale", null, 2, 25, null, true).getResult();
		if (secondPageKaleProducts.size() == 0
				|| secondPageKaleProducts.get(0).getName() == null
				|| secondPageKaleProducts.get(0).getId().equals(kaleProducts.get(0).getId())) {
			throw new APITestException("Error: get 2nd page products");
		}

		List<ProductData> upcProduct = productsController.productsSearchProducts(null, "014100044208", 1, 25, null, true).getResult();
		if (upcProduct.size() == 0
				|| !upcProduct.get(0).getName().equals("Pepperidge Farm Classic BBQ Cracker Chips, 6 Oz")) {
			throw new APITestException("Error: get upc products");
		}

		List<ProductData> eanProduct = productsController.productsSearchProducts(null, "096619872404", null, null, null, true).getResult();
		if (eanProduct.size() == 0
				|| !eanProduct.get(0).getName().equals("Beckett Basketball Monthly Houston Rocket English")) {
			throw new APITestException("Error: get ean products");
		}

		ProductData productFull = productsController.productsGetProduct("380728", true).getResult();
		if (productFull == null
				|| !productFull.getName().equals("Peanut Butter Chocolate Party Size Candies")) {
			throw new APITestException("Error: get full product");
		}

		List<ProductAlternativesRecord> productsAlternatives = productsController.productsGetProductsAlternatives("120907, 120902","7").getResult();
		if (productsAlternatives.size() == 0
				|| !productsAlternatives.get(0).getProductAlternatives().get(0).getName().equals("Lightlife Smart Deli Veggie Slices Roast Turkey")) {
			throw new APITestException("Error: get full product");
		}

		List<PriceData> productPrices = productsController.productsGetProductPrices("314878, 314328").getResult();
		if (productPrices.size() == 0 || !productPrices.get(0).getPrices().get(0).getStoreId().equals(2)) {
			throw new APITestException("Error: get full product");
		}
	}
}
