public class DigitalVideoDisc {
    // Attributes of the DigitalVideoDisc class
    private String titlePhucNH;    
    private String categoryPhucNH;  
    private String directorPhucNH;  
    private int lengthPhucNH;       
    private float costPhucNH;          
    // Getter for the title
    public String getTitlePhucNH() {
        return titlePhucNH;
    }
    // Setter for the title
    public void setTitlePhucNH(String titlePhucNgo) {
        this.titlePhucNH = titlePhucNgo;
    }   
    // Getter for the category
    public String getCategoryPhucNH() {
        return categoryPhucNH;
    }
    // Setter for the category
    public void setCategoryPhucNH(String categoryPhucNgo) {
        this.categoryPhucNH = categoryPhucNgo;
    }
    // Getter for the director
    public String getDirectorPhucNH() {
        return directorPhucNH;
    }
    // Setter for the director
    public void setDirectorPhucNH(String directorPhucNgo) {
        this.directorPhucNH = directorPhucNgo;
    }
    // Getter for the length
    public int getLengthPhucNH() {
        return lengthPhucNH;
    }
    // Setter for the length
    public void setLengthPhucNH(int lengthPhucNgo) {
        this.lengthPhucNH = lengthPhucNgo;
    }
    // Getter for the cost
    public float getCostPhucNH() {
        return costPhucNH;
    }
    // Setter for the cost
    public void setCostPhucNH(float costPhucNgo) {
        this.costPhucNH = costPhucNgo;
    }
    // Constructor with title
    public DigitalVideoDisc(String titlePhucNgo) {
        super();
        this.titlePhucNH = titlePhucNgo; // Initialize title
    }
    // Constructor with category, title, and cost
    public DigitalVideoDisc(String categoryPhucNgo, String titlePhucNgo, float costPhucNgo) {
        super(); 
        this.categoryPhucNH = categoryPhucNgo; // Initialize category
        this.titlePhucNH = titlePhucNgo; // Initialize title
        this.costPhucNH = costPhucNgo; // Initialize cost
    }
    // Constructor with director, category, title, and cost
    public DigitalVideoDisc(String directorPhucNgo, String categoryPhucNgo, String titlePhucNgo, float costPhucNgo) {
        super(); 
        this.directorPhucNH = directorPhucNgo; // Initialize director
        this.categoryPhucNH = categoryPhucNgo; // Initialize category
        this.titlePhucNH = titlePhucNgo; // Initialize title
        this.costPhucNH = costPhucNgo; // Initialize cost
    }
    // Constructor with title, category, director, length, and cost
    public DigitalVideoDisc(String titlePhucNgo, String categoryPhucNgo, String directorPhucNgo, int lengthPhucNgo, float costPhucNgo) {
        super(); 
        this.titlePhucNH = titlePhucNgo; // Initialize title
        this.categoryPhucNH = categoryPhucNgo; // Initialize category
        this.directorPhucNH = directorPhucNgo; // Initialize director
        this.lengthPhucNH = lengthPhucNgo; // Initialize length
        this.costPhucNH = costPhucNgo; // Initialize cost
    }
}