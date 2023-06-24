package hust.soict.cybersec.aims.media;

import hust.soict.cybersec.aims.exeption.PlayerException;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JDialog;
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
	public void play() throws PlayerException {
        if(this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            JFrame f = new JFrame();
            f.setSize(400, 400);
            JDialog d = new JDialog(f, "Playing disc...");
            d.setLayout(new FlowLayout());
            d.add(new JLabel("Playing DVD: " + this.getTitle()));
            d.add(new JLabel("DVD length: " + this.getLength()));
        }
        else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
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
	
	public boolean equals(Track track){
        return this.getTitle() == track.getTitle() & this.getLength() == track.getLength();
    }

}
