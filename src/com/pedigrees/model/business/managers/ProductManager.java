package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.domain.Product;
import com.pedigrees.model.services.productservice.IProductService;
import com.pedigrees.model.services.exceptions.ProductServiceException;


/**
 * @author Ish
 *
 * This Manager class uses the properties file provided by the SuperManagerType,
 * calls the ServiceFactory, and executes services requested by the presentation layer. 
 *
 *  It called to create a new product object.
 *
 *
 */
 public class ProductManager extends ManagerSuperType {
	
	
	 public ProductManager() {
	  // construct object . . .
	 }

	 
	//Use Case Driven - Adding new envelope
	 public boolean addNewProduct(Product product)throws ServiceLoadException, ProductServiceException
	    {
	    	boolean isNewProductAdded = false;
		 	ServiceFactory serviceFactory = new ServiceFactory();
	    	IProductService productSvc = (IProductService)serviceFactory.getService("IProductService");
	    	productSvc.storeProductData(product);

	    	return isNewProductAdded;
	    }//end addNewProduct
}
