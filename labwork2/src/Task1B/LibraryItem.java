package Task1B;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String title, String author, int publicationYear) {
		this.author = author;
		this.publicationYear = publicationYear;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String toString() {
		return "Title: "+title+ ", author: " + author + ", Publication year: " + publicationYear ;
	}
	
	

}
