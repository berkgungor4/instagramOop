package instagramOop;

public class ReelsPage extends Page {
	
	private String accountName;
	private Boolean like;
	private Boolean follow;
	
	public ReelsPage() {
		super();
	}

	public ReelsPage(String accountName, Boolean like, Boolean follow) {
		super();
		this.accountName = accountName;
		this.like = like;
		this.follow = follow;
	}

	public Boolean getLike() {
		return like;
	}

	public void setLike(Boolean like) {
		this.like = like;
	}

	public Boolean getFollow() {
		return follow;
	}

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}

	public String getAccountName() {
		return accountName;
	}
	
}
