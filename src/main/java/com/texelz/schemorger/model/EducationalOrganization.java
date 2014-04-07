package com.texelz.schemorger.model;

/**
 *
 * An educational organization.
 * @fullPath Thing > Organization > EducationalOrganization
 *
 * @author Texelz (by Onhate)
 *
 */
public class EducationalOrganization extends Organization {

	private Person alumni;
	/**
	 * Alumni of educational organization.
	 */
	public Person getAlumni() {
		return this.alumni;
	}
	public void setAlumni(Person alumni) {
		this.alumni = alumni;
	}
}
