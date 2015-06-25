/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class PurchaseItemProductBuilder {
    //the instance to build
    private PurchaseItemProduct purchaseItemProduct;

	/**
     * Default constructor to initialize the instance
     */
    public PurchaseItemProductBuilder() {
        purchaseItemProduct = new PurchaseItemProduct();
    }

    public PurchaseItemProductBuilder id(Integer id) {
        purchaseItemProduct.setId(id);
        return this;
    }

    public PurchaseItemProductBuilder name(String name) {
        purchaseItemProduct.setName(name);
        return this;
    }

    public PurchaseItemProductBuilder upc(String upc) {
        purchaseItemProduct.setUpc(upc);
        return this;
    }

    public PurchaseItemProductBuilder categoryId(Integer categoryId) {
        purchaseItemProduct.setCategoryId(categoryId);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public PurchaseItemProduct build() {
		return purchaseItemProduct;
	}
}