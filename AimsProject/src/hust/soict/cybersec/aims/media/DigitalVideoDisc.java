package hust.soict.cybersec.aims.media;

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
	public void play() {
		System.out.println("");
		
	}

	

}
