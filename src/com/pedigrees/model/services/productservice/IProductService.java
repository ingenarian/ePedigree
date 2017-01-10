package com.pedigrees.model.services.productservice;
import com.pedigrees.model.services.exceptions.ProductServiceException;
import com.pedigrees.model.domain.Product;
import com.pedigrees.model.services.IService;

/**
 * @author Ish
 *
 */

/** 
 * Create an product object 
 * @param Product
 * 							captures information from manufacturer  to create a product object. 
 * @throws ProductServiceException
 *  
 * 							If the Product object is null or is not found 
 * 
 * */
public interface IProductService extends IService{
	
	public final String NAME = "IProductService";

	public boolean storeProductData(Product product)throws ProductServiceException;
}