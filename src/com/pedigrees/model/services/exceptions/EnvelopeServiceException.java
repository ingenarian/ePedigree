/**
 * 
 */
package com.pedigrees.model.services.exceptions;

/**
 * @author Ish
 *
 */
public class EnvelopeServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9172352070183292174L;
	
	public EnvelopeServiceException(final String esxMessage)
    {
        super(esxMessage);
    }
	
	
	public EnvelopeServiceException(final String esxMessage, final Throwable eNestedException)
    {
        super(esxMessage, eNestedException);
    }

}
