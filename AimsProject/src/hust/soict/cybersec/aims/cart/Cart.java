package hust.soict.cybersec.aims.cart;


import java.util.ArrayList;
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
	
}
