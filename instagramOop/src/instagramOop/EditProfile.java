package instagramOop;

public class EditProfile {
	
	private String[] profilePhoto;
	private String changeProfilePhoto;
	private String name;
	private String userName;
	private String website;
	private String bio;
	private Boolean switchToProfessionalAccount;
	private Boolean personalInformationSettings;
	private Boolean approve;
	
	public EditProfile() {
		super();
	}

	public EditProfile(String[] profilePhoto, String changeProfilePhoto, String name, String userName, String website,
			String bio, Boolean switchToProfessionalAccount, Boolean personalInformationSettings, Boolean approve) {
		super();
		this.profilePhoto = profilePhoto;
		this.changeProfilePhoto = changeProfilePhoto;
		this.name = name;
		this.userName = userName;
		this.website = website;
		this.bio = bio;
		this.switchToProfessionalAccount = switchToProfessionalAccount;
		this.personalInformationSettings = personalInformationSettings;
		this.approve = approve;
	}

	public String getChangeProfilePhoto() {
		return changeProfilePhoto;
	}

	public void setChangeProfilePhoto(String changeProfilePhoto) {
		this.changeProfilePhoto = changeProfilePhoto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Boolean getSwitchToProfessionalAccount() {
		return switchToProfessionalAccount;
	}

	public void setSwitchToProfessionalAccount(Boolean switchToProfessionalAccount) {
		this.switchToProfessionalAccount = switchToProfessionalAccount;
	}

	public Boolean getPersonalInformationSettings() {
		return personalInformationSettings;
	}

	public void setPersonalInformationSettings(Boolean personalInformationSettings) {
		this.personalInformationSettings = personalInformationSettings;
	}

	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	public String[] getProfilePhoto() {
		return profilePhoto;
	}
	
	
	
}
