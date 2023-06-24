package hust.soict.cybersec.aims.media;
import hust.soict.cybersec.aims.exeption.PlayerException;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	
    public CompactDisc(String title, String category, String director, int length, float cost, String artist, List<Track> tracks) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks =  tracks ;
    }

    public CompactDisc(String title, String category, String director, String artist, float cost) {
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setCost(cost);
        this.artist = artist;

    }

		private void setDirector(String director) {
	}

		public String getArtist() {
		return artist;
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
	public void play() throws PlayerException {
		if(this.getLength() > 0) {
			java.util.Iterator iterator = tracks.iterator();
			Track nexTrack;
			while(iterator.hasNext()) {
				nexTrack = (Track) iterator.next();
				try {
						nexTrack.play();
				}catch(PlayerException e) {
					throw e;
				}
			}
		}
		
		
	}

	public Track[] getTracks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
