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
public class PedigreeTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.Pedigree#validate()}.
	 */
	@Test
	public void testValidate() {
		Pedigree p1 = new Pedigree("Manufacturer","zzzz","3","Antibiotics","110mg","3K","Tango","Genetech","McKesson","John Doe");
		//p1.validate should assert to True since all variables 
		// being passed to create a new Pedigree are all valid.
		assertTrue ("p1 validates", p1.validate());
	       System.out.println("testValidate PASSED");
	}

	
	/**
	 * Test with a invalid pedigree passed in
	 */
	public void testNotValidation() {
		Pedigree p1 = new Pedigree();
		// p1.validate should not pass here since we are not
		// sending in valid parameters - in the case of Pedigree
		// class, its valid only if all class variables are passed
		assertFalse ("p1 does not validate", p1.validate());
	       System.out.println("testNotValidate PASSED");
			
		
	}
	
	/**
	 * Test method for {@link com.pedigrees.model.domain.Pedigree#equals(com.pedigrees.model.domain.Pedigree)}.
	 */
	@Test
	public void testEqualsPedigree() {
		Pedigree p1 = new Pedigree("Manufacturer","zzzz","3","Antibiotics","110mg","3K","Tango","Genetech","McKesson","John Doe");
		Pedigree p2 = new Pedigree("Manufacturer","zzzz","3","Antibiotics","110mg","3K","Tango","Genetech","McKesson","John Doe");
		// this should assert to true since the contents of 
		// p1 and p2 class variables are identical.
		assertTrue ("p1 equals p2", p1.equals(p2));
	       System.out.println("testEqualsPedigree PASSED");
	}
	
	
	/**
	 * Test if two pedigree are not equal
	 */
	public void testNotEqualsPedigree() {
		Pedigree p1 = new Pedigree("Manufacturer","zzzz","3","Antibiotics","110mg","3K","Tango","Genetech","McKesson","John Doe");
		Pedigree p2 = new Pedigree("Manufacturer","zzzz","3","Antibiotics","110mg","3K","Tango","Genetech","Sanofi","Jack Kan");
		// this should assert to false since the contents of 
		// p1 and p2 class variables are not identical.
		assertFalse ("p1 does not equals p2", p1.equals(p2));
	       System.out.println("testNotEqualsPedigree PASSED");
	       
	}

}
