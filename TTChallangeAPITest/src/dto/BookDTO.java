package dto;

public class BookDTO {
	public int id;
	public String author;
	public String title;
	
	public BookDTO(int id, String author, String title) {
		this.id = id;
		this.author = author;
		this.title  =title;
	}
	
	public int getID() {
		return this.id;
	}
	
	public BookDTO setAuthor(String author) {
		this.author = author;
		return this;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public BookDTO setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getTitle() {
		return this.title;
	}
}
