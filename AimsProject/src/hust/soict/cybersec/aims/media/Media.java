package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	

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

