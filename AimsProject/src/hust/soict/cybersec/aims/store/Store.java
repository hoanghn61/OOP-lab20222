package hust.soict.cybersec.aims.store;

import java.util.ArrayList;

import hust.soict.cybersec.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public boolean addMedia(Media media) {
		if (itemsInStore.size() > 20){
            return false;
        }
        else{
            for (Media mediaName:itemsInStore){
                if (media.equals(mediaName)){
                	System.out.println("This media is already exist");
                }else {
                	itemsInStore.add(media);
                }
                
                }
            }return true;
	}

        public void displayStore(){
        for (Media media:
             itemsInStore) {
            System.out.println(media.toString());
        }
    }
	
	public boolean removeMedia(Media media) {
		for(Media mediaName:itemsInStore) {
			if (media.equals(mediaName)) {
				itemsInStore.remove(media);			
				return true;
			}else {
				System.out.println("This media is not exist");
			}
		}return false;
	
	}
    public boolean checkMedia(Media media){
        for (Media name : itemsInStore){
            if (media.equals(name)){
                return true;
            }
        }
        return false;
        
    }

    public Media searchByTitle(String title) {
        return null;
    }

}