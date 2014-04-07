package com.texelz.schemorger.model;

/**
 *
 * A placeholder for multiple similar products of the same kind.
 * @fullPath Thing > Product > SomeProducts
 *
 * @author Texelz (by Onhate)
 *
 */
public class SomeProducts extends Product {

	private QuantitativeValue inventoryLevel;
	/**
	 * The current approximate inventory level for the item or items.
	 */
	public QuantitativeValue getInventoryLevel() {
		return this.inventoryLevel;
	}
	public void setInventoryLevel(QuantitativeValue inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}
}
