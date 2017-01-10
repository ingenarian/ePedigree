package com.pedigrees.model.services.exceptions;

public class ManufacturerServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -577548794145979010L;
	
	public ManufacturerServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public ManufacturerServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
