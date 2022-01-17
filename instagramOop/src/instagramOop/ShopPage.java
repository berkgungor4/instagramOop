package instagramOop;

public class ShopPage extends Page {
	
	private Boolean stores;
	private Boolean videos;
	private Boolean editorsPicks;
	private Boolean collections;
	private Boolean guides;
	private String search;
	
	public ShopPage() {
		super();
	}

	public ShopPage(Boolean stores, Boolean videos, Boolean editorsPicks, Boolean collections, Boolean guides,
			String search) {
		super();
		this.stores = stores;
		this.videos = videos;
		this.editorsPicks = editorsPicks;
		this.collections = collections;
		this.guides = guides;
		this.search = search;
	}

	public Boolean getStores() {
		return stores;
	}

	public void setStores(Boolean stores) {
		this.stores = stores;
	}

	public Boolean getVideos() {
		return videos;
	}

	public void setVideos(Boolean videos) {
		this.videos = videos;
	}

	public Boolean getEditorsPicks() {
		return editorsPicks;
	}

	public void setEditorsPicks(Boolean editorsPicks) {
		this.editorsPicks = editorsPicks;
	}

	public Boolean getCollections() {
		return collections;
	}

	public void setCollections(Boolean collections) {
		this.collections = collections;
	}

	public Boolean getGuides() {
		return guides;
	}

	public void setGuides(Boolean guides) {
		this.guides = guides;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
}
