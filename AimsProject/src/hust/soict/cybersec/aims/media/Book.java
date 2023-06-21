package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;


public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, Float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;

	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public boolean addAuthor(String author) {
		for (String authorName : authors) {
			if (author.equals(authorName)) {
				System.out.println("This author has been in the list");
				
			}else {
				authors.add(author);
			}
		}return true;
		
	}
	
	public boolean removeAuthor(String author) {
		for (String authorName : authors) {
			if (author.equals(authorName)) {
				authors.remove(author);
				
			}else {
				System.out.println("This author is not in the list");
			}
	
		}
		return false;
	}

}
