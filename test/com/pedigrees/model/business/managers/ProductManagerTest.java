package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.Product;
import com.pedigrees.model.services.exceptions.ProductServiceException;

public class ProductManagerTest {

	ServiceFactory serviceFactory;
	Product product;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	product = new Product();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the ProductManager's ability to add a new product
	* per use case directive by calling the 
	* service factory to serve up the IProductService and
	* so it (ProductManger) can execute the ProductSvcImpl.
	*
	*
	* If so, then:
	*
	* the testAddNewProduct should create a new product object called 
	* product1.obj
	* 
	* If not, then:
	* 
	* the testAddNewProduct should fail to create a new product object.
	*/

	@Test 
	
	public void testAddNewProduct() {
		
		ProductManager productManager = new ProductManager();
		try {
			productManager.addNewProduct(product);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProductServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
