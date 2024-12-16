package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
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
    public DigitalVideoDisc( String titlePhucNH, String categoryPhucNH, String directorPhucNH, float costPhucNH) {
        super(titlePhucNH, categoryPhucNH,directorPhucNH, costPhucNH);
        
    }
    // Constructor for a DVD with ID, title, category, director, length, and cost.
    public DigitalVideoDisc( String titlePhucNH, String categoryPhucNH, String directorPhucNH, int lengthPhucNH, float costPhucNH) {
        super(titlePhucNH, categoryPhucNH, directorPhucNH,lengthPhucNH, costPhucNH);
        
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
        System.out.println("Ngo Hoang Phuc 20225903. Playing DVD: " + this.getTitlePhucNH());
        System.out.println("Ngo Hoang Phuc 20225903. DVD Length: " + this.getLengthPhucNH());
    }
}