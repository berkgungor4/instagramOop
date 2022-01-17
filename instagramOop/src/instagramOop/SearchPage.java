package instagramOop;

public class SearchPage extends Page {

	private String search;

	public SearchPage() {
		super();
	}

	public SearchPage(String search) {
		super();
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
}
