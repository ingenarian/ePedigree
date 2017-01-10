/**
 * 
 */
package com.pedigrees.model.business.factory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
//import com.pedigrees.model.business.managers.PropertyManager;
import com.pedigrees.model.services.IService;

/**
 * Service Factory
 * It provides an interface to the Use Case Managers for implementation services. 
 * @author Ish
 *
 */
public class ServiceFactory {

	public ServiceFactory() {}
	
	public IService getService(String serviceName) throws ServiceLoadException
	{
		try 
		{
		   Class<?> c = Class.forName(getImplName(serviceName));
		   return (IService)c.newInstance();
		} catch (Exception excp) 
		{
		   serviceName = serviceName + " not loaded";
		   throw new ServiceLoadException(serviceName, excp);
		}
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return
	 * @throws Exception
	 */
	private String getImplName (String serviceName) throws Exception
	{
		
	    java.util.Properties props = new java.util.Properties();

	    java.io.FileInputStream source = new 
		    java.io.FileInputStream("/home/Ish/E_Pedigree_Week7/Pedigree_Week7/config/application.properties");
	    props.load(source);
	    source.close();
	    return props.getProperty(serviceName);
	    
	    
		
		//return PropertyManager.getPropertyValue(serviceName);
	}
	
}
	