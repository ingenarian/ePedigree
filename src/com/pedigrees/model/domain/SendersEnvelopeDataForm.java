package com.pedigrees.model.domain;
import java.io.Serializable;

public class SendersEnvelopeDataForm implements Serializable{

	/** @author Ish
	 * 
	 * Sender's Envelope Data form captures and saves sender information to 
	 * the envelope composite for the construction of a new envelope.
	 */
	private static final long serialVersionUID = -4209503231189244661L;
	
	/** Sender's first name on the envelope */
	private String envelopeSendersFirstName;
	
	/** Sender's middle initial on the envelope */
	private String envelopeSendersMiddleInitial;
	
	/** Sender's last name on the envelope */
	private String envelopeSendersLastName;	
	
	/** Sender's street address on the envelope */
	private String envelopeSendersStreetAddress;
	
	/** Sender's city on the envelope */
	private String envelopeSendersCity;
	
	/** Sender's state on the envelope */
	private String envelopeSendersState;
	
	/** Sender's zipcode on the envelope */
	private String envelopeSendersZipCode;
	
	/** Envelope message */
	private String envelopeMessageBody;

	/**
	 * @param envelopeSendersFirstName
	 * @param envelopeSendersMiddleInitial
	 * @param envelopeSendersLastName
	 * @param envelopeSendersStreetAddress
	 * @param envelopeSendersCity
	 * @param envelopeSendersState
	 * @param envelopeSendersZipCode
	 * @param envelopeMessageBody
	 */
	
	public SendersEnvelopeDataForm() {
		
	}
	
	public SendersEnvelopeDataForm(String envelopeSendersFirstName,String envelopeSendersMiddleInitial,String envelopeSendersLastName,String envelopeSendersStreetAddress,
			String envelopeSendersCity,String envelopeSendersState,String envelopeSendersZipCode, String envelopeMessageBody)
			{
			super();
			this.envelopeSendersFirstName = envelopeSendersFirstName;
			this.envelopeSendersMiddleInitial = envelopeSendersMiddleInitial;
			this.envelopeSendersLastName = envelopeSendersLastName;	
			this.envelopeSendersStreetAddress = envelopeSendersStreetAddress;
			this.envelopeSendersCity = envelopeSendersCity;
			this.envelopeSendersState = envelopeSendersState;
			this.envelopeSendersZipCode = envelopeSendersZipCode;
			this.envelopeMessageBody = envelopeMessageBody;
			}
	
	// getters and setters
	
	/**
	 * @return Returns the sender's envelope first name.
	 */
	
	public String getEnvelopeSendersFirstName() {
		return envelopeSendersFirstName;
	}
	
	/**
	 * @set Sets the sender's envelope first name.
	 */
	
	public void setEnvelopeSendersFirstName(String envelopeSendersFirstName) {
		this.envelopeSendersFirstName = envelopeSendersFirstName; 
	}

	/**
	 * @return Returns the sender's envelope middle initial.
	 */
	
	public String getEnvelopeSendersMiddleInitial() {
		return envelopeSendersMiddleInitial;
	}
	
	/**
	 * @set Sets the sender's envelope middle initial.
	 */

	public void setEnvelopeSendersMiddleInitial(String envelopeSendersMiddleInitial) {
		this.envelopeSendersMiddleInitial = envelopeSendersMiddleInitial;
	}
	
	/**
	 * @return Returns the sender's envelope last name.
	 */
	
	public String getEnvelopeSendersLastName() {
		return envelopeSendersLastName;
	}
	
	/**
	 * @set Sets the sender's envelope last name.
	 */

	public void setEnvelopeSendersLastName(String envelopeSendersLastName) {
		this.envelopeSendersLastName = envelopeSendersLastName; 
	}
	
	/**
	 * @return Returns the sender's envelope street address.
	 */
	
	public String getEnvelopeSendersStreetAddress() {
		return envelopeSendersStreetAddress;
	}
	
	/**
	 * @set Sets the sender's envelope street address.
	 */
	
	public void setEnvelopeSendersStreetAddress(String envelopeSendersStreetAddress){
		this.envelopeSendersStreetAddress = envelopeSendersStreetAddress;
	}
	
	/**
	 * @return Returns the sender's envelope city location.
	 */
	
	public String getEnvelopeSendersCity() {
		return envelopeSendersCity;
	}
	
	/**
	 * @set Sets the sender's envelope city location.
	 */
	
	public void setEnvelopeSendersCity(String envelopeSendersCity) {
		this.envelopeSendersCity = envelopeSendersCity;
	}
	
	/**
	 * @return Returns the sender's envelope state location.
	 */
	
	public String getEnvelopeSendersState() {
		return envelopeSendersState;
	}
	
	/**
	 * @set Sets the sender's envelope state location.
	 */
	
	public void setEnvelopeSendersState(String envelopeSendersState) {
		this.envelopeSendersState = envelopeSendersState;
	}
	
	/**
	 * @return Returns the sender's envelope zip code.
	 */
	
	public String getEnvelopeSendersZipCode() {
		return envelopeSendersZipCode;
	}
	
	/**
	 * @set Sets the sender's envelope zip code.
	 */
	
	public void setEnvelopeSendersZipCode(String envelopeSendersZipCode) {
		this.envelopeSendersZipCode = envelopeSendersZipCode;
	}
	
   /**
	 * @return Returns the receiver's envelope message.
	 */
	public String getEnvelopeMessageBody() {
		return envelopeMessageBody;
	}
	
	/**
	 * @set Sets the receiver's envelope message.
	 */
	public void setEnvelopeMessageBody(String envelopeMessageBody) {
		this.envelopeMessageBody = envelopeMessageBody;
	}
	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate () 
	{
		
		if (envelopeSendersFirstName == null) return false;
		if (envelopeSendersMiddleInitial == null) return false;
		if (envelopeSendersLastName == null) return false;
		if (envelopeSendersStreetAddress == null) return false;
		if (envelopeSendersCity == null) return false;
		if (envelopeSendersState == null) return false;
		if (envelopeSendersZipCode == null) return false;
		if (envelopeMessageBody == null) return false;
		  
		return true;
	}
	
	/**
	* @param envelopeSendersFirstName;
	* @param envelopeSendersMiddleInitial;
	* @param envelopeSendersLastName;	
	* @param envelopeSendersStreetAddress;
	* @param envelopeSendersCity;
	* @param envelopeSendersState;
	* @param envelopeSendersZipCode;

    */
	
	public boolean equals(SendersEnvelopeDataForm sendersEnvelopeDataForm) 
	{
		if (!envelopeSendersFirstName.equals(sendersEnvelopeDataForm.envelopeSendersFirstName)) return false;
		if (!envelopeSendersMiddleInitial.equals(sendersEnvelopeDataForm.envelopeSendersMiddleInitial)) return false;
		if (!envelopeSendersLastName.equals(sendersEnvelopeDataForm.envelopeSendersLastName)) return false;
		if (!envelopeSendersStreetAddress.equals(sendersEnvelopeDataForm.envelopeSendersStreetAddress)) return false;
		if (!envelopeSendersCity.equals(sendersEnvelopeDataForm.envelopeSendersCity)) return false;
		if (!envelopeSendersState.equals(sendersEnvelopeDataForm.envelopeSendersState)) return false;
		if (!envelopeSendersZipCode.equals(sendersEnvelopeDataForm.envelopeSendersZipCode)) return false;
		if (!envelopeMessageBody.equals(sendersEnvelopeDataForm.envelopeMessageBody)) return false;

	return true;
	}
	
	
	/**
	 * toString() method useful for logging
	 *  
	 */
	
	public String toString()
	{
	  StringBuffer strBfr = new StringBuffer();
	  strBfr.append("envelopeSendersFirstName:");
	  strBfr.append(envelopeSendersFirstName);
	  strBfr.append("\nenvelopeSendersMiddleInitial:");
	  strBfr.append(envelopeSendersMiddleInitial);
	  strBfr.append("\nenvelopeSendersLastName:");
	  strBfr.append(envelopeSendersLastName);
	  strBfr.append("\nenvelopeSendersStreetAddress :");
	  strBfr.append(envelopeSendersStreetAddress);
	  strBfr.append("\nenvelopeSendersCity:");	
      strBfr.append(envelopeSendersCity);
	  strBfr.append("\nenvelopeSendersState:");	
      strBfr.append(envelopeSendersState);
	  strBfr.append("\nenvelopeSendersZipCode:");	
      strBfr.append(envelopeSendersZipCode);
      strBfr.append("\nenvelopeReceiversFirstName:");	
      strBfr.append(envelopeMessageBody);


      return strBfr.toString();
	
	
	}
	
	
	
	
}
