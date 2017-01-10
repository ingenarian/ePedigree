/**
 * 
 */
package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.services.IService;


public abstract class ManagerSuperType 
{
	private ServiceFactory Servicefactory = new ServiceFactory();
	
	protected IService getService(String name) throws 
		ServiceLoadException
	{
	     return Servicefactory.getService(name);
	}
}