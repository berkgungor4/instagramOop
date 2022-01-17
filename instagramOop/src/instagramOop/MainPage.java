package instagramOop;

public class MainPage extends Page {

	private String followedName;
	private String[] stories;
	
	public MainPage() {
		super();
	}

	public MainPage(String followedName, String[] stories) {
		super();
		this.followedName = followedName;
		this.stories = stories;
	}

	public String getFollowedName() {
		return followedName;
	}

	public String[] getStories() {
		return stories;
	}
	
}
