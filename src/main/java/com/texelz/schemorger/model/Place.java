package com.texelz.schemorger.model;

/**
 *
 * Entities that have a somewhat fixed, physical extension.
 * @fullPath Thing > Place
 *
 * @author Texelz (by Onhate)
 *
 */
public class Place extends Thing {

	private PostalAddress address;
	private AggregateRating aggregateRating;
	private Place containedIn;
	private Event event;
	private String faxNumber;
	private Object geo;
	private String globalLocationNumber;
	private String interactionCount;
	private String isicV4;
	private Object logo;
	private com.texelz.schemorger.definition.Link map;
	private OpeningHoursSpecification openingHoursSpecification;
	private Object photo;
	private Review review;
	private String telephone;
	/**
	 * Physical address of the item.
	 */
	public PostalAddress getAddress() {
		return this.address;
	}
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	/**
	 * The basic containment relation between places.
	 */
	public Place getContainedIn() {
		return this.containedIn;
	}
	public void setContainedIn(Place containedIn) {
		this.containedIn = containedIn;
	}
	/**
	 * Upcoming or past event associated with this place or organization. Supercedes <a href="events">events</a>.
	 */
	public Event getEvent() {
		return this.event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	/**
	 * The fax number.
	 */
	public String getFaxNumber() {
		return this.faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	/**
	 * The geo coordinates of the place.
	 * @see GeoCoordinates
	 * @see GeoShape
	 */
	public Object getGeo() {
		return this.geo;
	}
	public void setGeo(Object geo) {
		this.geo = geo;
	}
	/**
	 * The Global Location Number (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 */
	public String getGlobalLocationNumber() {
		return this.globalLocationNumber;
	}
	public void setGlobalLocationNumber(String globalLocationNumber) {
		this.globalLocationNumber = globalLocationNumber;
	}
	/**
	 * A count of a specific user interactions with this item—for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href="UserInteraction">UserInteraction</a>.
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 */
	public String getIsicV4() {
		return this.isicV4;
	}
	public void setIsicV4(String isicV4) {
		this.isicV4 = isicV4;
	}
	/**
	 * A logo associated with an organization.
	 * @see URL
	 * @see ImageObject
	 */
	public Object getLogo() {
		return this.logo;
	}
	public void setLogo(Object logo) {
		this.logo = logo;
	}
	/**
	 * A URL to a map of the place. Supercedes <a href="maps">maps</a>.
	 */
	public com.texelz.schemorger.definition.Link getMap() {
		return this.map;
	}
	public void setMap(com.texelz.schemorger.definition.Link map) {
		this.map = map;
	}
	/**
	 * The opening hours of a certain place.
	 */
	public OpeningHoursSpecification getOpeningHoursSpecification() {
		return this.openingHoursSpecification;
	}
	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
		this.openingHoursSpecification = openingHoursSpecification;
	}
	/**
	 * A photograph of this place. Supercedes <a href="photos">photos</a>.
	 * @see Photograph
	 * @see ImageObject
	 */
	public Object getPhoto() {
		return this.photo;
	}
	public void setPhoto(Object photo) {
		this.photo = photo;
	}
	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	/**
	 * The telephone number.
	 */
	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
