package com.texelz.schemorger.model;

/**
 *
 * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
 * @fullPath Thing > Intangible > Audience > BusinessAudience
 *
 * @author Texelz (by Onhate)
 *
 */
public class BusinessAudience extends Audience {

	private QuantitativeValue numberofEmployees;
	private QuantitativeValue yearlyRevenue;
	private QuantitativeValue yearsInOperation;
	/**
	 * The size of business by number of employees.
	 */
	public QuantitativeValue getNumberofEmployees() {
		return this.numberofEmployees;
	}
	public void setNumberofEmployees(QuantitativeValue numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}
	/**
	 * The size of the business in annual revenue.
	 */
	public QuantitativeValue getYearlyRevenue() {
		return this.yearlyRevenue;
	}
	public void setYearlyRevenue(QuantitativeValue yearlyRevenue) {
		this.yearlyRevenue = yearlyRevenue;
	}
	/**
	 * The age of the business.
	 */
	public QuantitativeValue getYearsInOperation() {
		return this.yearsInOperation;
	}
	public void setYearsInOperation(QuantitativeValue yearsInOperation) {
		this.yearsInOperation = yearsInOperation;
	}
}
