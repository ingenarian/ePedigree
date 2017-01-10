/**
 * 
 */
package com.pedigrees.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ish
 *
 */
public class ManufacturerTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.Manufacturer#validate()}.
	 */
	@Test
	public void testValidate() {
		Manufacturer man1 = new Manufacturer("Glaxokline","GXK","YourID","YourPhone#","YourEmail","YourStreet","YourCity","YourState","YourZipCode");
		//pro1.validate should assert to True since all variables 
		// being passed to create a new Manufacturer are all valid.
		assertTrue ("man1 validates",man1.validate());
	    System.out.println("testValidate PASSED");
	}
	
	/**
	 * Tests with an invalid Manufacturer passed in
	 */
	public void testNotValidate() {
		Manufacturer man1 = new Manufacturer();
		// man1.validate should not pass here since we are not
		// sending in valid parameters - in the case of Manufacturer
		// class, its valid only if all class variables are passed
		assertFalse ("man1 does not validate", man1.validate());
	       System.out.println("testNotValidate PASSED");
	}

	/**
	 * Test method for {@link com.pedigrees.model.domain.Manufacturer#equals(com.pedigrees.model.domain.Manufacturer)}.
	 */
	@Test
	public void testEqualsManufacturer() {
		Manufacturer man1 = new Manufacturer("Glaxokline","GXK","YourID","YourPhone#","YourEmail","YourStreet","YourCity","YourState","YourZipCode");
		Manufacturer man2 = new Manufacturer("Glaxokline","GXK","YourID","YourPhone#","YourEmail","YourStreet","YourCity","YourState","YourZipCode");
		// this should assert to true since the contents of 
		// man1 and man2 class variables are identical.
		assertTrue ("man1 equals man2", man1.equals(man2));
	       System.out.println("testEqualsManufacturer PASSED");
	}

	
	/**
	 * Test if two Manufacturers are not equal
	 */
	public void testNotEqualsManufacturer() {
		Manufacturer man1 = new Manufacturer("Glaxokline","GXK","YourID","YourPhone#","YourEmail","YourStreet","YourCity","YourState","YourZipCode");
		Manufacturer man2 = new Manufacturer("Glaxokline","GXK","YourID","YourPhone#","YourEmail","YourStreet","YourCity","YourState","YourTitle");
		// this should assert to false since the contents of 
		// man1 and man2 class variables are NOT identical.
		assertFalse ("man1 does NOT equal man2", man1.equals(man2));
	       System.out.println("testNotEqualsManufacturer PASSED");
	}
	
	
}
