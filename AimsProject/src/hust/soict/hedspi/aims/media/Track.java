package hust.soict.hedspi.aims.media;

// Track class represents a music track and implements the Playable interface.
public class Track implements Playable {
    // Attributes
    private String titlePhucNH; // Title of the track
    private int lengthPhucNH;   // Length of the track in seconds

    // Constructor
    public Track(String titlePhucNH, int lengthPhucNH) {
        this.titlePhucNH = titlePhucNH;
        this.lengthPhucNH = lengthPhucNH;
    }

    // Getters and Setters
    public String getTitlePhucNH() { return titlePhucNH; }
    public void setTitlePhucNH(String titlePhucNH) { this.titlePhucNH = titlePhucNH; }
    public int getLengthPhucNH() { return lengthPhucNH; }
    public void setLengthPhucNH(int lengthPhucNH) { this.lengthPhucNH = lengthPhucNH; }

    // Method to play the track
    public void play() {
        System.out.println("Ngo Hoang Phuc 20225903. Playing track: " + titlePhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Track length: " + lengthPhucNH + " seconds");
    }

    @Override
    public boolean equals(Object obj) {
        Track track = (Track) obj;
        return track.getTitlePhucNH().equals(this.getTitlePhucNH()) && track.getLengthPhucNH() == this.getLengthPhucNH();
    }
}