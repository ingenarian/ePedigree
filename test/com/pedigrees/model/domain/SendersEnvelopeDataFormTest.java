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
public class SendersEnvelopeDataFormTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.SendersEnvelopeDataForm#validate()}.
	 */
	@Test
	public void testValidate() {
		SendersEnvelopeDataForm s1 = new SendersEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","message");
		//s1.validate should assert to True since all variables 
		// being passed to create a new senders form are all valid.
		assertTrue ("s1 validates",s1.validate());
	       System.out.println("testValidate PASSED");
	}

	
	/**
	 * Tests with an invalid sender form passed in
	 */
	public void testNotValidate() {
		SendersEnvelopeDataForm s1 = new SendersEnvelopeDataForm();
		// s1.validate should not pass here since we are not
		// sending in valid parameters - in the case of senders form
		// class, its valid only if all class variables are passed
		assertFalse ("s1 does not validate", s1.validate());
	       System.out.println("testNotValidate PASSED");		
	}
	/**
	 * Test method for {@link com.pedigrees.model.domain.SendersEnvelopeDataForm#equals(com.pedigrees.model.domain.SendersEnvelopeDataForm)}.
	 */
	@Test
	public void testEqualsSendersEnvelopeDataForm() {
		SendersEnvelopeDataForm s1 = new SendersEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","message");
		SendersEnvelopeDataForm s2 = new SendersEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","message");
		// this should assert to true since the contents of 
		// s1 and s2 class variables are identical.
		assertTrue ("s1 equals s2", s1.equals(s2));
	       System.out.println("testEqualsEnvelope PASSED");
	}

	/**
	 * Test if two senders forms are not equal
	 */
	public void testNotEqualsEnvelope() {
		SendersEnvelopeDataForm s1 = new SendersEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","message");
		SendersEnvelopeDataForm s2 = new SendersEnvelopeDataForm("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","");
		// this should assert to false since the contents of 
		// s1 and s2 class variables are NOT identical.
		assertFalse ("s1 does NOT equal s2", s1.equals(s2));
	       System.out.println("testNotEqualsEnvelope PASSED");
	}
	
}
