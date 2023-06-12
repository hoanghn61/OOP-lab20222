package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
	@Override
	public int compare(Media a, Media b) {
		if (a.getCost() < b.getCost()) {
			return 1;
			
			}
		else if (a.getCost() > b.getCost()) {
			return -1;
			
		}
		else {
			//sort by title
			return a.getTitle().compareTo(b.getTitle());
		}
	}
	
}