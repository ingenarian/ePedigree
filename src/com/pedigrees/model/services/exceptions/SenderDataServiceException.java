package com.pedigrees.model.services.exceptions;

public class SenderDataServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6963481377929219358L;
	
	public SenderDataServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public SenderDataServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
