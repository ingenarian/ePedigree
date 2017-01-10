package com.pedigrees.model.services.exceptions;

public class PedigreeServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5748491972694207553L;
	
	public PedigreeServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public PedigreeServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
