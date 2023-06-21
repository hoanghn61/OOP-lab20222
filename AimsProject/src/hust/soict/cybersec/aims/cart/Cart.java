package hust.soict.cybersec.aims.cart;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public boolean addMedia(Media media) {
		if (itemsOrdered.size() > 20){
            return false;
        }
        else{
            for (Media mediaName:itemsOrdered){
                if (media.equals(mediaName)){
                	System.out.println("This media is already exist");
                }else {
                	itemsOrdered.add(media);
                }
                
                }
            }return true;
	}
	
	public boolean removeMedia(Media media) {
		for(Media mediaName:itemsOrdered) {
			if (media.equals(mediaName)) {
				itemsOrdered.remove(media);			
				return true;
			}else {
				System.out.println("This media is not exist");
			}
		}return false;
	
	}
	
	public float totalCost() {
		float totalMediaCost = 0;
		for (Media mediaName:itemsOrdered) {
			float mediaCost = mediaName.getCost();
			totalMediaCost += mediaCost;
		}
		return totalMediaCost;
		
	}

      public void playMedia(Media media) {
        if (media instanceof CompactDisc) {
            ((CompactDisc) media).play();
        }
        if (media instanceof DigitalVideoDisc) {
            ((DigitalVideoDisc) media).play();
        }
        if (media instanceof Book) {
            System.out.println("Book cannot play");
        }
    }

    public void displayCart(){
        double total = totalCost();

        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media:
             itemsOrdered) {
            int i=0;
            System.out.println((++i) + ". " + media.toString());
        }
        System.out.printf("Total cost: %.2f $\n",total);
        System.out.println("***************************************************");
    }

    public Media searchByTitle(String title) {
        for(Media m : itemsOrdered) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return m;
            }
        }
        return null;
    }

    public Media searchById(int id) {
        for(Media m : itemsOrdered) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

	
}
