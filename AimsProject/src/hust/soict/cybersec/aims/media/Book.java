package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator.OfPrimitive;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
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
