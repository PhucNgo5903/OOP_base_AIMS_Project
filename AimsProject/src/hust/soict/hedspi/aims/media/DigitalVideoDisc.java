package hust.soict.hedspi.aims.media;

// DigitalVideoDisc class represents a DVD and extends the Disc class, implementing the Playable interface.
// Vietnam-Vu
public class DigitalVideoDisc extends Disc implements Playable {

    // Constructors
    // Constructor for a DVD with ID and title.
    public DigitalVideoDisc(int idPhucNH, String titlePhucNH) {
        super(idPhucNH, titlePhucNH);
    }

    // Constructor for a DVD with ID, title, category, and cost.
    public DigitalVideoDisc(int idPhucNH, String titlePhucNH, String categoryPhucNH, float costPhucNH) {
        this(idPhucNH, titlePhucNH);
        this.setCategoryPhucNH(categoryPhucNH);
        this.setCostPhucNH(costPhucNH);
    }

    // Constructor for a DVD with ID, title, category, director, and cost.
    public DigitalVideoDisc(int idPhucNH, String titlePhucNH, String categoryPhucNH, String directorPhucNH, float costPhucNH) {
        this(idPhucNH, titlePhucNH, categoryPhucNH, costPhucNH);
        this.setDirectorPhucNH(directorPhucNH);
    }

    // Constructor for a DVD with ID, title, category, director, length, and cost.
    public DigitalVideoDisc(int idPhucNH, String titlePhucNH, String categoryPhucNH, String directorPhucNH, int lengthPhucNH, float costPhucNH) {
        this(idPhucNH, titlePhucNH, categoryPhucNH, directorPhucNH, costPhucNH);
        this.setLengthPhucNH(lengthPhucNH);
    }

    // Method to print details of a DVD
    @Override
    public void print() {
        System.out.println(getIdPhucNH() + ". DVD - "
                + getTitlePhucNH() + " - "
                + getCategoryPhucNH() + " - "
                + getDirectorPhucNH() + " - "
                + getLengthPhucNH() + " : "
                + getCostPhucNH() + "$");
    }

    // Method to play a DVD
    public void play() {
        System.out.println("Playing DVD: " + this.getTitlePhucNH());
        System.out.println("DVD Length: " + this.getLengthPhucNH());
    }
}