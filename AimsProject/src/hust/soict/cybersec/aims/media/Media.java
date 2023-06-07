package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Media media) {
		return this.getTitle() == media.getTitle();
	}
	
	public String toString() {
		return "Title: " + this.title;
	}

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		

		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
		
	}

}
