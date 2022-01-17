package instagramOop;

public class Dm {

	private String search;
	private String[] accountImage;
	private String accountName;
	
	public Dm() {
		super();
	}

	public Dm(String search, String[] accountImage, String accountName) {
		super();
		this.search = search;
		this.accountImage = accountImage;
		this.accountName = accountName;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String[] getAccountImage() {
		return accountImage;
	}

	public String getAccountName() {
		return accountName;
	}
	
}
