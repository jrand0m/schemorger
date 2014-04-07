package com.texelz.schemorger.model;

/**
 *
 * An agent pays a price to a participant.
 * @fullPath Thing > Action > TradeAction > PayAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class PayAction extends TradeAction {

	private Object purpose;
	private Object recipient;
	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * @see Thing
	 * @see MedicalDevicePurpose
	 */
	public Object getPurpose() {
		return this.purpose;
	}
	public void setPurpose(Object purpose) {
		this.purpose = purpose;
	}
	/**
	 * A sub property of participant. The participant who is at the receiving end of the action.
	 * @see Person
	 * @see Organization
	 * @see Audience
	 */
	public Object getRecipient() {
		return this.recipient;
	}
	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}
}
