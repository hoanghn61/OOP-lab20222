package hust.soict.cybersec.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	@Override
	public int compare(Media a, Media b) {
		int titleCompare = a.getTitle().compareTo(b.getTitle());
		if (titleCompare != 0) {
			return titleCompare;
			
		}
		//If titles are the same, compare bt costs
		
		if (a.getCost() > b.getCost()){
			return -1;
			
		}else if (a.getCost() < b.getCost()) {
			return 1;
			
		}else {
			return 0;
		}
	}	
}

