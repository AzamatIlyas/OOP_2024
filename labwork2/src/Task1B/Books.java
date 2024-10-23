package Task1B;

public class Books extends LibraryItem {
	private int pages;
	
	public Books(String title, String author, int year, int pages) {
		super(title,author,year);
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return "Title: "+ getTitle() + ", author: " + getAuthor() + ", Publication year: " + getPublicationYear() + ", number of pages: " + pages ;
	}
	
	
}
