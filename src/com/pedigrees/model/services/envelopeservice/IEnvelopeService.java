/**
 * 
 */
package com.pedigrees.model.services.envelopeservice;
import com.pedigrees.model.services.exceptions.EnvelopeServiceException;
import com.pedigrees.model.domain.Envelope;
import com.pedigrees.model.services.IService;
/**
 * @author Ish
 *
 */

/** 
 * Create an envelope object 
 * @param Envelope should hold user data captured from the sender's and reciever's sub-forms to create an envelope object. 
 * @throws EnvelopeServiceException If the Envelope object is null or is not found 
 * 
 * */
public interface IEnvelopeService extends IService{
	
	public final String NAME = "IEnvelopeService";

	public boolean createEnvelopeData(Envelope envelope)throws EnvelopeServiceException;
}
