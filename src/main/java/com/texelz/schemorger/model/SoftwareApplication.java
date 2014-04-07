package com.texelz.schemorger.model;

/**
 *
 * A software application.
 * @fullPath Thing > CreativeWork > SoftwareApplication
 *
 * @author Texelz (by Onhate)
 *
 */
public class SoftwareApplication extends CreativeWork {

	private Object applicationCategory;
	private Object applicationSubCategory;
	private String applicationSuite;
	private String countriesNotSupported;
	private String countriesSupported;
	private String device;
	private com.texelz.schemorger.definition.Link downloadUrl;
	private Object featureList;
	private String fileFormat;
	private Integer fileSize;
	private com.texelz.schemorger.definition.Link installUrl;
	private Object memoryRequirements;
	private String operatingSystem;
	private String permissions;
	private String processorRequirements;
	private Object releaseNotes;
	private Object requirements;
	private Object screenshot;
	private String softwareVersion;
	private Object storageRequirements;
	/**
	 * Type of software application, e.g. &quot;Game, Multimedia&quot;.
	 * @see URL
	 * @see Text
	 */
	public Object getApplicationCategory() {
		return this.applicationCategory;
	}
	public void setApplicationCategory(Object applicationCategory) {
		this.applicationCategory = applicationCategory;
	}
	/**
	 * Subcategory of the application, e.g. &quot;Arcade Game&quot;.
	 * @see URL
	 * @see Text
	 */
	public Object getApplicationSubCategory() {
		return this.applicationSubCategory;
	}
	public void setApplicationSubCategory(Object applicationSubCategory) {
		this.applicationSubCategory = applicationSubCategory;
	}
	/**
	 * The name of the application suite to which the application belongs (e.g. Excel belongs to Office)
	 */
	public String getApplicationSuite() {
		return this.applicationSuite;
	}
	public void setApplicationSuite(String applicationSuite) {
		this.applicationSuite = applicationSuite;
	}
	/**
	 * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public String getCountriesNotSupported() {
		return this.countriesNotSupported;
	}
	public void setCountriesNotSupported(String countriesNotSupported) {
		this.countriesNotSupported = countriesNotSupported;
	}
	/**
	 * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public String getCountriesSupported() {
		return this.countriesSupported;
	}
	public void setCountriesSupported(String countriesSupported) {
		this.countriesSupported = countriesSupported;
	}
	/**
	 * Device required to run the application. Used in cases where a specific make/model is required to run the application.
	 */
	public String getDevice() {
		return this.device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	/**
	 * If the file can be downloaded, URL to download the binary.
	 */
	public com.texelz.schemorger.definition.Link getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(com.texelz.schemorger.definition.Link downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	/**
	 * Features or modules provided by this application (and possibly required by other applications).
	 * @see URL
	 * @see Text
	 */
	public Object getFeatureList() {
		return this.featureList;
	}
	public void setFeatureList(Object featureList) {
		this.featureList = featureList;
	}
	/**
	 * MIME format of the binary (e.g. application/zip).
	 */
	public String getFileFormat() {
		return this.fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	/**
	 * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
	 */
	public Integer getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	/**
	 * URL at which the app may be installed, if different from the URL of the item.
	 */
	public com.texelz.schemorger.definition.Link getInstallUrl() {
		return this.installUrl;
	}
	public void setInstallUrl(com.texelz.schemorger.definition.Link installUrl) {
		this.installUrl = installUrl;
	}
	/**
	 * Minimum memory requirements.
	 * @see URL
	 * @see Text
	 */
	public Object getMemoryRequirements() {
		return this.memoryRequirements;
	}
	public void setMemoryRequirements(Object memoryRequirements) {
		this.memoryRequirements = memoryRequirements;
	}
	/**
	 * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	/**
	 * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
	 */
	public String getPermissions() {
		return this.permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	/**
	 * Processor architecture required to run the application (e.g. IA64).
	 */
	public String getProcessorRequirements() {
		return this.processorRequirements;
	}
	public void setProcessorRequirements(String processorRequirements) {
		this.processorRequirements = processorRequirements;
	}
	/**
	 * Description of what changed in this version.
	 * @see URL
	 * @see Text
	 */
	public Object getReleaseNotes() {
		return this.releaseNotes;
	}
	public void setReleaseNotes(Object releaseNotes) {
		this.releaseNotes = releaseNotes;
	}
	/**
	 * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
	 * @see URL
	 * @see Text
	 */
	public Object getRequirements() {
		return this.requirements;
	}
	public void setRequirements(Object requirements) {
		this.requirements = requirements;
	}
	/**
	 * A link to a screenshot image of the app.
	 * @see URL
	 * @see ImageObject
	 */
	public Object getScreenshot() {
		return this.screenshot;
	}
	public void setScreenshot(Object screenshot) {
		this.screenshot = screenshot;
	}
	/**
	 * Version of the software instance.
	 */
	public String getSoftwareVersion() {
		return this.softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	/**
	 * Storage requirements (free space required).
	 * @see URL
	 * @see Text
	 */
	public Object getStorageRequirements() {
		return this.storageRequirements;
	}
	public void setStorageRequirements(Object storageRequirements) {
		this.storageRequirements = storageRequirements;
	}
}
