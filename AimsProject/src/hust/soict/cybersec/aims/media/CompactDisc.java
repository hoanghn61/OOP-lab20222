package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc() {
		super();
	}
	
	public boolean addTrack(Track track) {
		for (Track trackName : tracks ) {
			if (track.equals(trackName)) {
				System.out.println("This track is alredy exist");
				
			}else {
				tracks.add(track);
			}
			
		}return true;	
	}
	
	public boolean removeTrack(Track track) {
		for (Track trackName : tracks) {
			if (track.equals(trackName)) {
				tracks.remove(track);
			}else {
				System.out.println("This track is not exist");
				
			}
			
		}return false;
	}
	
	public int getLength() {
		int sumLength = 0;
		for (Track trackName :  tracks) {
			int Tracklength = trackName.getLength();
			sumLength += Tracklength;
		}
		return sumLength;
		
		
		
	}

	@Override
	public void play() {
		for (Track trackName:tracks) {
			trackName.play();
		}
		
		
	}
	
	

}
