package hust.soict.cybersec.aims.media;
import javax.swing.JFrame;
import javax.swing.JDialog;
import hust.soict.cybersec.aims.exeption.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	 public DigitalVideoDisc(String title) {
	        this.setTitle(title);
	        nbDigitalVideoDiscs += 1;
	        this.setId(nbDigitalVideoDiscs); 

	    }
	    
	    public DigitalVideoDisc() {
	    }
	    public DigitalVideoDisc(String title, String category, float cost) {
	        this.setTitle(title);
	        this.setCategory(category);
	        this.setCost(cost);
	        nbDigitalVideoDiscs += 1;
	        this.setId(nbDigitalVideoDiscs);

	    }
	    
		public DigitalVideoDisc(String title, String category, String director, float cost) {
	        this.setTitle(title);
	        this.setCategory(category);
	        this.setCost(cost);
	        nbDigitalVideoDiscs += 1;
	        this.setId(nbDigitalVideoDiscs);
		}
	    
	    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	        this.setTitle(title);
	        this.setCategory(category);
	        this.director = director;
	        this.length = length;
	        this.setCost(cost);
	        nbDigitalVideoDiscs += 1;
	        this.setId(nbDigitalVideoDiscs);

	    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static boolean isMatch(DigitalVideoDisc dvd, String title){
        if (dvd.getTitle() == title){
            return true;
        }else return false;
    }

    public static boolean isMatch(DigitalVideoDisc dvd, int id){
        if (dvd.getId() == id){
            return true;
        }else return false;
    }

    @Override
    public void play() throws PlayerException {
    	if (this.getLength() > 0) {
    	     System.out.println("Playing DVD: " + this.getTitle());
             System.out.println("DVD length: " + this.getLength());
             JFrame f = new JFrame();
             f.setSize(400,200);
             JDialog d = new JDialog(f, "Playing disc...");
    		
    	}else {
    		throw new PlayerException("ERROR: DVD length is non-positive!");
    	}
    }
    
    
}

	


