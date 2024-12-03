package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.List;


public class Store {

    //Attribute
    private List<Media> itemsInStorePhucNH = new ArrayList <Media>(); // List to store available Media items in store
    
    //Constructor
    public Store(){

    }

    // Method to add a new media to the store
    public void addMedia(Media mediaPhucNH){
        // Add media to the store
        itemsInStorePhucNH.add(mediaPhucNH);
        // Notify that media has been added successfully
        System.out.println("Ngo Hoang Phuc 20225903. Added successfully");

    }

    //Method to remove a media from the store
    public void removeMedia(Media mediaPhucNH){
        //Search for media in store
        int indexOfRemovedPhucNH = itemsInStorePhucNH.indexOf(mediaPhucNH);
        // If the media is not found
        if(indexOfRemovedPhucNH == -1){
            System.out.println("Ngo Hoang Phuc 20225903. Not found media!");
            return;
        }

        // Remove the media
        itemsInStorePhucNH.remove(indexOfRemovedPhucNH);
        //Notify that media has been removed successfully
        System.out.println("Ngo Hoang Phuc 20225903. Removed successfully!");
    }

    //Getters and Setters
    //Getter for the list of items in the store
    public List<Media> getItemsInStorePhucNH() {return itemsInStorePhucNH;}

    //Setter for the list of items in the store
    public void setItemsInStore(List<Media> itemsInStorePhucNH){
        this.itemsInStorePhucNH = itemsInStorePhucNH;
    }

    public void print(){
        System.out.println("***********************************LIST ITEMS IN STORE***********************************");
        for (Media mediaPhucNH : this.itemsInStorePhucNH){
            System.out.println(mediaPhucNH.toString());
        }
        System.out.println("*****************************************************************************************");
    }

    public Media findMediaById(int idPhucNH){
        for(Media mediaPhucNH : itemsInStorePhucNH){
            if(mediaPhucNH.getIdPhucNH() == idPhucNH){
                return mediaPhucNH;
            }
        }
        return null;
    }

    public Media findMediaByTitle(String titlePhucNH){
        for(Media mediaPhucNH : itemsInStorePhucNH){
            if(mediaPhucNH.getTitlePhucNH().equalsIgnoreCase(titlePhucNH)){
                return mediaPhucNH;
            }
        }
        return null;
    }

}