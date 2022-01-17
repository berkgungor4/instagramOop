package instagramOop;

public class Followers {
	
	private String search;
	private String allFollowers;
	private String followRequests;
	private Boolean remove;
	private String[] accountImage;
	private String accountName;
	
	public Followers() {
		super();
	}

	public Followers(String search, String allFollowers, String followRequests, Boolean remove, String[] accountImage,
			String accountName) {
		super();
		this.search = search;
		this.allFollowers = allFollowers;
		this.followRequests = followRequests;
		this.remove = remove;
		this.accountImage = accountImage;
		this.accountName = accountName;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Boolean getRemove() {
		return remove;
	}

	public void setRemove(Boolean remove) {
		this.remove = remove;
	}

	public String getAllFollowers() {
		return allFollowers;
	}

	public String getFollowRequests() {
		return followRequests;
	}

	public String[] getAccountImage() {
		return accountImage;
	}

	public String getAccountName() {
		return accountName;
	}
	
}
