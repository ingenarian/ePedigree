/**
 * 
 */
package com.pedigrees.model.business.exceptions;

/**
 * @author Ish
 *
 */
public class PropertyFileNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8789445397239289177L;

	public PropertyFileNotFoundException(final String propMessage, final Throwable propNestedException)
    {
        super(propMessage, propNestedException);
    }
}
