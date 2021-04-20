package sw.main;

public class Book {

	private String title = "";
	private String author = "";
	private String signature="";
	private String iSBNn = "";
	
	public Book(String title, String author, String signature, String iSBN) {
		super();
		this.title = title;
		this.author = author;
		this.signature = signature;
		iSBNn = iSBN;
	}

	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return iSBNn;
	}
	public String getSignature() {
		return signature;
	}

}
