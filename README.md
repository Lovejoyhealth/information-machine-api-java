Information Machine API
=================

How To Configure:
=================
File InformationMachineAPITest\clienttest.txt contains several parameters in order to fully test the api using InformationMachineAPITest project.
Each line of this file represents a certain expected value that you need to give in order to test the api.
The file initially contains the following:

1. YOUR_CLIENT_ID
2. YOUR_CLIENT_SECRET
3. STORE_NAME(EXAMPLE:WALMART)
4. USERNAME_FOR_GIVEN_STORE
5. PASSWORD_FOR_GIVEN_STORE

So, you need to replace the lines in clienttest.txt file with corresponding value.

How To Build:
=============
The generated code uses a java library namely UniRest. The reference to this
library is already added as a maven dependency in the generated pom.xml
file. Therefore, you will need internet access to resolve this dependency.

For build process do the following:

    1. Open Eclipse and use "Import" option in "File" menu.
    2. Select "General -> Existing Projects into Workspace" option from the tree list.
    3. In "Select root directory", provide path to the unzipped archive for the generated code.
    4. Click "Finish" and ensure that "Project -> Build Automatically" option is enabled in the menu.

How To Use:
===========
Export the compiled classes as a java libray (jar). The exported jar can be used as library.
See the following links for more information on this topic.

Exporting JARs:
http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftasks-33.htm

Using JARs:
http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jst.j2ee.doc.user%2Ftopics%2Ftjimpapp.html

The quickest way to see how you should use the API and library itself, import the InformationMachineAPITest and InformationMachineAPILib projects and debug the test project to see how the api is used.

The generated controller classes accept the client_id and client_secret key parameters in their
respective constructors. An example of this is given below:

```
	ProductsController productsController = new ProductsController(clientId, clientSecret);
```

Then you can use that to call methods such as:

```
	ProductData productFull = productsController.productsGetProduct("380728", true).getResult();
    List<ProductData> kaleProducts = productsController.productsGetProducts("Kale", null, 1, 25, true).getResult();
```

All methods return wrapper object which contains meta information (number of available requests, maximum number of requests per minute) and result object. Additionally if the result is of an array type, meta object will contain paging information (current page, items per page, total number of items, url to next page if there is a next page).

For more information on which methods are available please go to [Information Machine](http://iamdata.co/swagger/ui/index)