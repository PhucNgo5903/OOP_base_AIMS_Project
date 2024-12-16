package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

// CompactDisc class represents a CD and extends the Disc class, implementing the Playable interface.
public class CompactDisc extends Disc implements Playable {
    // Attributes
    private String artistPhucNH; // Artist of the CD
    private List<Track> tracksPhucNH = new ArrayList<>(); // List of tracks in the CD
    // Constructor
    public CompactDisc(int idPhucNH, String titlePhucNH, String categoryPhucNH, float costPhucNH,
                       String directorPhucNH, int lengthPhucNH, String artistPhucNH) {
        super(idPhucNH, titlePhucNH, categoryPhucNH, costPhucNH, directorPhucNH, lengthPhucNH);
        this.artistPhucNH = artistPhucNH;
    }
    public CompactDisc( String titlePhucNH, String categoryPhucNH, String artistPhucNH, float costPhucNH) {
        super(titlePhucNH, categoryPhucNH, costPhucNH);
        this.artistPhucNH =artistPhucNH;
    }
    // Getter and Setter
    public String getArtistPhucNH() {
        return artistPhucNH;
    }
    public void setArtistPhucNH(String artistPhucNH) {
        this.artistPhucNH = artistPhucNH;
    }
    // Method to add a track to the CD
    public void addTrack(Track trackPhucNH) {
        int indexOfTrackPhucNH = tracksPhucNH.indexOf(trackPhucNH);
        if (indexOfTrackPhucNH != -1) {
            System.out.println("Ngo Hoang Phuc 20225903. Track is already in the list");
            return;
        }
        tracksPhucNH.add(trackPhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Add track successfully");
    }
    // Method to remove a track from the CD
    public void removeTrack(Track trackPhucNH) {
        int indexOfTrackPhucNH = tracksPhucNH.indexOf(trackPhucNH);
        if (indexOfTrackPhucNH == -1) {
            System.out.println("Ngo Hoang Phuc 20225903. Track is absent in the list");
            return;
        }

        tracksPhucNH.remove(indexOfTrackPhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Remove track successfully");
    }
    // Method to get the total length of the CD by summing the lengths of all tracks
    @Override
    public int getLengthPhucNH() {
        int lengthPhucNH = 0;
        for (Track trackPhucNH : tracksPhucNH) {
            lengthPhucNH += trackPhucNH.getLengthPhucNH();
        }
        setLengthPhucNH(lengthPhucNH);
        return lengthPhucNH;
    }
    // Method to play the CD and its tracks
    public void play() {
        System.out.println("Playing CD: " + this.getTitlePhucNH());
        System.out.println("CD artist: " + artistPhucNH);
        System.out.println("CD length: " + this.getLengthPhucNH());
        for (Track trackPhucNH : tracksPhucNH) {
            trackPhucNH.play();
        }
    }
    // Method to print details of the CD
    @Override
    public void print() {
        System.out.println(getIdPhucNH() + ". CD - "
                + getTitlePhucNH() + " - "
                + getCategoryPhucNH() + " - "
                + getDirectorPhucNH() + " - "
                + artistPhucNH + " - "
                + getLengthPhucNH() + " : "
                + getCostPhucNH() + "$");
    }
}