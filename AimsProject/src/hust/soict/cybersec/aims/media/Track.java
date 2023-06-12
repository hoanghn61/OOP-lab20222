package hust.soict.cybersec.aims.media;

public class Track implements Playable {
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public Track() {
		
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
		
	}
	@Override
	public void play() {
		System.out.println("DVD's title: " + this.getTitle());
		System.out.println("DVD's length: " + this.getLength());
		
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {  // check if obj is an instance of Track
            Track track = (Track) obj;  // cast the obj to Track
            return super.equals(obj)  // call the equals method in Media class
                && this.length == track.length;  // compare the title and length of the tracks for equality
        }
        return false;
    }
	
	@Override
    public String toString() {
        return "Track{" + "title='" + getTitle() + '\'' +", length=" + length  ;
	}
	
	
	

}
