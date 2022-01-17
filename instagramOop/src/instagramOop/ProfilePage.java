package instagramOop;

public class ProfilePage extends Page {
	
	private int numberOfPosts;
	private int numberOfFollowers;
	private int numberOfFollowing;
	private String posts;
	private String followers;
	private String following;
	private String nameSurname;
	private String bio;
	
	public ProfilePage() {
		super();
	}

	public ProfilePage(int numberOfPosts, int numberOfFollowers, int numberOfFollowing, String posts, String followers,
			String following, String nameSurname, String bio) {
		super();
		this.numberOfPosts = numberOfPosts;
		this.numberOfFollowers = numberOfFollowers;
		this.numberOfFollowing = numberOfFollowing;
		this.posts = posts;
		this.followers = followers;
		this.following = following;
		this.nameSurname = nameSurname;
		this.bio = bio;
	}

	public int getNumberOfPosts() {
		return numberOfPosts;
	}

	public void setNumberOfPosts(int numberOfPosts) {
		this.numberOfPosts = numberOfPosts;
	}

	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}

	public void setNumberOfFollowers(int numberOfFollowers) {
		this.numberOfFollowers = numberOfFollowers;
	}

	public int getNumberOfFollowing() {
		return numberOfFollowing;
	}

	public void setNumberOfFollowing(int numberOfFollowing) {
		this.numberOfFollowing = numberOfFollowing;
	}

	public String getPosts() {
		return posts;
	}

	public String getFollowers() {
		return followers;
	}

	public String getFollowing() {
		return following;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public String getBio() {
		return bio;
	}
	
}
