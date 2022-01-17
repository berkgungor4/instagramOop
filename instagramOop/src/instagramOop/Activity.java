package instagramOop;

public class Activity{
	
	private String[] accountImage;
	private String accountName;
	private Boolean confirm;
	private Boolean delete;
	private Boolean follow;
	private String followRequests;
	
	public Activity() {
		super();
	}

	public Activity(String[] accountImage, String accountName, Boolean confirm, Boolean delete, Boolean follow,
			String followRequests) {
		super();
		this.accountImage = accountImage;
		this.accountName = accountName;
		this.confirm = confirm;
		this.delete = delete;
		this.follow = follow;
		this.followRequests = followRequests;
	}

	public Boolean getConfirm() {
		return confirm;
	}

	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}

	public Boolean getDelete() {
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	public Boolean getFollow() {
		return follow;
	}

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}

	public String[] getAccountImage() {
		return accountImage;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getFollowRequests() {
		return followRequests;
	}
	
}
