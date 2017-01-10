package com.pedigrees.model.services.exceptions;

public class EnvelopeCompositeServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 287802666559509882L;
	
	public EnvelopeCompositeServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public EnvelopeCompositeServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
