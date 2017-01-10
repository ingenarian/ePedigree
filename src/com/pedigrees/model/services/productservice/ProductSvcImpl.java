package com.pedigrees.model.services.productservice;
import java.io.*;


import com.pedigrees.model.services.exceptions.ProductServiceException;
import com.pedigrees.model.domain.Product;
/**
 * Product Service Implementation
 * Creates a new product object at the request of ProductManager.
 *  
 * 
 * 
 * @author Ish
 *
 */

public class ProductSvcImpl implements IProductService{
	
	public boolean storeProductData(Product product)throws ProductServiceException {
		
		boolean isGood = false;
		Product pDT1 = new Product();
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("product1.obj"));
			os.writeObject(pDT1);
			os.close();
		} catch (IOException ex) {
		  ex.printStackTrace();
		} 
		
		return isGood;
	} // end Product Service
		
}


