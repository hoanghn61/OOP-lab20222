package hust.soict.cybersec.aims.media;

public class Disc extends Media {
	
	private int length;
	private String director;
	
	
	public Disc() {
		super();
	}

	public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }


	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	
	

}
