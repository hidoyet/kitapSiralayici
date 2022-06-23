package kitapSiralayici;



public class Book implements Comparable<Book>{

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return getBookName().compareTo(o.bookName);
	}

	String bookName;
	String authorName;
	String publishDate;
	int pageNumber;
	
	public Book(String bookName, String authorName,String publishDate, int pageNumber) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.pageNumber = pageNumber;
		this.publishDate=publishDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	
	

}
