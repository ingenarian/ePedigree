package com.pedigrees.model.services.exceptions;

public class ReceiverDataServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4378838238452875425L;
	
	public ReceiverDataServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public ReceiverDataServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
