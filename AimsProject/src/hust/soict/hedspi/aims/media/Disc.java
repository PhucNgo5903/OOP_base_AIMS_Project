package hust.soict.hedspi.aims.media;


public class Disc extends Media {
    //Attributes

    private String directorPhucNH;
    
    private int lengthPhucNH;

    //Constructors
    //Constructor for a disc with ID and title.
    public Disc(int idPhucNH, String titlePhucNH){super(idPhucNH, titlePhucNH);}

    //Constructor for a disc with ID, title, category, cost, director and length
    public Disc(int idPhucNH, String titlePhucNH, String categoryPhucNH, float costPhucNH, String directorPhucNH, int lengthPhucNH){
        super(idPhucNH, titlePhucNH, categoryPhucNH, costPhucNH);
        this.directorPhucNH = directorPhucNH;
        this.lengthPhucNH = lengthPhucNH;
    }

    //Getters and Setters
    //Getter and Setter for the director of the disc
    public String getDirectorPhucNH(){ return directorPhucNH;}

    public void setDirectorPhucNH(String directorPhucNH) {this.directorPhucNH = directorPhucNH;}

    //Getter and Setter for the length of the disc content
    public int getLengthPhucNH(){return lengthPhucNH;}

    public void setLengthPhucNH(int lengthPhucNH){this.lengthPhucNH = lengthPhucNH;}
}