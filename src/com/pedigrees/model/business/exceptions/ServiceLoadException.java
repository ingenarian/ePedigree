/**
 * 
 */
package com.pedigrees.model.business.exceptions;

/**
 * @author Ish
 *
 */
@SuppressWarnings("serial")
public class ServiceLoadException extends Exception {
	
	public ServiceLoadException(final String svcMessage, final Throwable svcNestedException)
    {
        super(svcMessage, svcNestedException);
    }

}
