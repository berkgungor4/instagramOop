package instagramOop;

public class Page {
	
	private String[] images;
	private String pageName;
	
	public Page() {
		super();
	}

	public Page(String[] images, String pageName) {
		super();
		this.images = images;
		this.pageName = pageName;
	}

	public String[] getImages() {
		return images;
	}

	public String getPageName() {
		return pageName;
	}
	
}
