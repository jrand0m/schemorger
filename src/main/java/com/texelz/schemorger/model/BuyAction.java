package com.texelz.schemorger.model;

/**
 *
 * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
 * @fullPath Thing > Action > TradeAction > BuyAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class BuyAction extends TradeAction {

	private Object vendor;
	private WarrantyPromise warrantyPromise;
	/**
	 * A sub property of participant. The seller.The participant/person/organization that sold the object.
	 * @see Person
	 * @see Organization
	 */
	public Object getVendor() {
		return this.vendor;
	}
	public void setVendor(Object vendor) {
		this.vendor = vendor;
	}
	/**
	 * The warranty promise(s) included in the offer.
	 */
	public WarrantyPromise getWarrantyPromise() {
		return this.warrantyPromise;
	}
	public void setWarrantyPromise(WarrantyPromise warrantyPromise) {
		this.warrantyPromise = warrantyPromise;
	}
}
