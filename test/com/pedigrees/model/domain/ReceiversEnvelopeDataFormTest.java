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
public class ReceiversEnvelopeDataFormTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.ReceiversEnvelopeDataForm#validate()}.
	 */
	@Test
	public void testValidate() {
		ReceiversEnvelopeDataForm r1 = new ReceiversEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765");
		//r1.validate should assert to True since all variables 
		// being passed to create a new receivers form are all valid.
		assertTrue ("r1 validates",r1.validate());
	       System.out.println("testValidate PASSED");
	}

	/**
	 * Tests with an invalid receiver's form passed in
	 */
	public void testNotValidate() {
		ReceiversEnvelopeDataForm r1 = new ReceiversEnvelopeDataForm();
		// r1.validate should not pass here since we are not
		// sending in valid parameters - in the case of receivers form
		// class, its valid only if all class variables are passed
		assertFalse ("r1 does not validate", r1.validate());
	       System.out.println("testNotValidate PASSED");		
	}
	/**
	 * Test method for {@link com.pedigrees.model.domain.ReceiversEnvelopeDataForm#equals(com.pedigrees.model.domain.ReceiversEnvelopeDataForm)}.
	 */
	@Test
	public void testEqualsReceiversEnvelopeDataForm() {
		ReceiversEnvelopeDataForm r1 = new ReceiversEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765");
		ReceiversEnvelopeDataForm r2 = new ReceiversEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765");
		// this should assert to true since the contents of 
		// e1 and e2 class variables are identical.
		assertTrue ("r1 equals r2", r1.equals(r2));
	       System.out.println("testEqualsEnvelope PASSED");
	}

	
	/**
	 * Test if two receiver forms are not equal
	 */
	public void testNotEqualsEnvelope() {
		ReceiversEnvelopeDataForm r1 = new ReceiversEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765");
		ReceiversEnvelopeDataForm r2 = new ReceiversEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "");
		// this should assert to false since the contents of 
		// e1 and e2 class variables are NOT identical.
		assertFalse ("r1 does NOT equal r2", r1.equals(r2));
	       System.out.println("testNotEqualsEnvelope PASSED");
	}
	
	
}
