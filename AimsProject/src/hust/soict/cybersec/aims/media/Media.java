package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Comparator;
import java.util.List;


public class Media {
=======
import java.util.List;

public abstract class Media {
>>>>>>> a4e90632fef1e432e309ab3c80ecca88b3b7b01d
	private int id;
	private String title;
	private String category;
	private float cost;
	
<<<<<<< HEAD
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	
=======
>>>>>>> a4e90632fef1e432e309ab3c80ecca88b3b7b01d

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
<<<<<<< HEAD
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {  // check if obj is an instance of Media
            Media media = (Media) obj;  // cast the obj to Media
            return this.title.equals(media.title);  // compare the titles for equality
        }
        return false;
    }
	
	@Override
    public String toString() {
        return "Media{" + " title='" + title + '\'' + '}';
	}

		
}

=======
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
>>>>>>> a4e90632fef1e432e309ab3c80ecca88b3b7b01d
