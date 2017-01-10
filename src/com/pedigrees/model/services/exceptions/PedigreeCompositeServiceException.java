package com.pedigrees.model.services.exceptions;

public class PedigreeCompositeServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2423223608541848379L;
	
	public PedigreeCompositeServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public PedigreeCompositeServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
