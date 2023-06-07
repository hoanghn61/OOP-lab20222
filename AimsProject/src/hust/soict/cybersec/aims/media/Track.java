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
	
	public boolean equals(Track track){
        return this.getTitle() == track.getTitle() & this.getLength() == track.getLength();
    }
	
	
	

}
