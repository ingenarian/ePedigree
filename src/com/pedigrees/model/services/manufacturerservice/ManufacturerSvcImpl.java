/**
 * 
 */
package com.pedigrees.model.services.manufacturerservice;
import com.pedigrees.model.domain.Manufacturer;
import com.pedigrees.model.services.exceptions.ManufacturerServiceException;
import java.io.*;

/**
 * Manufacturer Service Implementation
 * Creates a new manufacturer profile object at the request of ManufacturerManager.
 *  
 * 
 * 
 * @author Ish
 *
 */
public class ManufacturerSvcImpl implements IManufacturerService {
	
			
		public boolean createMfgrProfile(Manufacturer manufacturer)throws ManufacturerServiceException {
			
			boolean isGood = false;
			Manufacturer mFG1 = new Manufacturer();
			
			try {
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("manufacturer1.obj"));
				os.writeObject(mFG1);
				os.close();
			} catch (IOException ex) {
			  ex.printStackTrace();
			} 
			
			return isGood;
		} // end Manufacturer

}
		

