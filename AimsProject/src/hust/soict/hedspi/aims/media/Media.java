package hust.soict.hedspi.aims.media;

import java.util.Comparator;
import java.util.Objects;

public abstract class Media {
    // Attributes
    private int idPhucNH; // Unique identifier for the media
    private String titlePhucNH; // Title of the media
    private String categoryPhucNH; // Category of the media
    private float costPhucNH; // Cost of the media

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
            new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE =
            new MediaComparatorByCostTitle();

    // Constructors
    public Media(int idPhucNH, String titlePhucNH) {
        this.idPhucNH = idPhucNH;
        this.titlePhucNH = titlePhucNH;
    }

    public Media(int idPhucNH, String titlePhucNH, String categoryPhucNH, float costPhucNH) {
        this.idPhucNH = idPhucNH;
        this.titlePhucNH = titlePhucNH;
        this.categoryPhucNH = categoryPhucNH;
        this.costPhucNH = costPhucNH;
    }

    // Method to print details of the media
    public void print() {
        // Implementation specific to each subclass
        System.out.println("ID: " + idPhucNH);
        System.out.println("Title: " + titlePhucNH);
        System.out.println("Category: " + categoryPhucNH);
        System.out.println("Cost: " + costPhucNH + "$");
    }
    // Method to check if the title matches the media
    public int getIdPhucNH() {return idPhucNH;}
    public void setIdPhucNH(int idPhucNH) {this.idPhucNH = idPhucNH;}
    public String getTitlePhucNH() {return titlePhucNH;}
    public void setTitlePhucNH(String titlePhucNH){this.titlePhucNH = titlePhucNH;}
    public String getCategoryPhucNH(){return categoryPhucNH;}
    public void setCategoryPhucNH(String categoryPhucNH){this.categoryPhucNH = categoryPhucNH;}
    public float getCostPhucNH(){return costPhucNH;}
    public void setCostPhucNH(float costPhucNH){this.costPhucNH = costPhucNH;}
    public boolean isMatchPhucNH(String title) {
        return this.titlePhucNH.toLowerCase().contains(title.toLowerCase());
    }
    public void play() {
        System.out.println("Playing media");
    }
    @Override
    public String toString(){
        return  "Ngo Hoang Phuc 20225903. Media{" +
                "id=" + idPhucNH +
                ", title='" + titlePhucNH + '\'' +
                ", category='" + categoryPhucNH + '\'' +
                ", cost=" + costPhucNH +
                '}';
    }
    @Override
    public boolean equals(Object o){
        Media mediaPhucNH = (Media) o;
        try{
            String titlePhucNH = mediaPhucNH.getTitlePhucNH();
            return titlePhucNH.equals(this.getTitlePhucNH());
        } catch (NullPointerException e){
            return false;
        }
    }   
}