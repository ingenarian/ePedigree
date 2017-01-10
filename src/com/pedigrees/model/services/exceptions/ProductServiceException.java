package com.pedigrees.model.services.exceptions;

public class ProductServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7133082510771918407L;

	
	
	public ProductServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public ProductServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }
}
