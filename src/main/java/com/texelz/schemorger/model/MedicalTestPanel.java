package com.texelz.schemorger.model;

/**
 *
 * Any collection of tests commonly ordered together.
 * @fullPath Thing > MedicalEntity > MedicalTest > MedicalTestPanel
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalTestPanel extends MedicalTest {

	private MedicalTest subTest;
	/**
	 * A component test of the panel.
	 */
	public MedicalTest getSubTest() {
		return this.subTest;
	}
	public void setSubTest(MedicalTest subTest) {
		this.subTest = subTest;
	}
}
