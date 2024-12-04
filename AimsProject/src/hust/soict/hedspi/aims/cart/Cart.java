package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.media.Media;
import java.util.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDEREDPhucNH = 20;
    private List<Media> itemsOrderedPhucNH = new ArrayList<Media>(); // List to store ordered Media items

    //Constructor
    public Cart(){

    }
    //Method to add a new media to the cart
    public void addMedia(Media mediaPhucNH) {
        if (itemsOrderedPhucNH.size() >= MAX_NUMBERS_ORDEREDPhucNH) {
            System.out.println("The cart is almost full!");
        } else if (itemsOrderedPhucNH.contains(mediaPhucNH)) {
            System.out.println(mediaPhucNH.getTitlePhucNH() + " is already in the cart!");
        } else {
            itemsOrderedPhucNH.add(mediaPhucNH);
            System.out.println(mediaPhucNH.getTitlePhucNH() + " has been added!");
        }
    }
    //Method to remove a media from the cart
    public void removeMedia(Media mediaPhucNH){
        int indexOfRemovedPhucNH = itemsOrderedPhucNH.indexOf(mediaPhucNH);
        //If not found
        if(indexOfRemovedPhucNH == -1){
            System.out.println("Ngo Hoang Phuc 20225903. Not found media!");
            return;
        }
        //Remove
        itemsOrderedPhucNH.remove(indexOfRemovedPhucNH);
        //Notify
        System.out.println("Removed successfully");
    }
    // Method to calculate the total cost of items in the cart
    public double totalCost(){
        float costPhucNH = 0;
        for(Media mediaPhucNH : itemsOrderedPhucNH){
            costPhucNH += mediaPhucNH.getCostPhucNH();
        }
        return Math.round(costPhucNH * 100.0)/ 100.0;
    }
    // Method to print the list of ordered items in the cart
    // Including the details of each items and the total cost
    public void print(){
        System.out.println("**********************************Cart**********************************");
        System.out.println("Ordered Items:");
        for(Media mediaPhucNH : itemsOrderedPhucNH){
            mediaPhucNH.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("************************************************************************");
    }

    //Search to remove items in cart  
    public Media searchToRemove(int id) {
        for (Media mediaPhucNH : itemsOrderedPhucNH) {
            if (mediaPhucNH.getIdPhucNH() == id) {  // So sánh ID của media
                return mediaPhucNH;
            }
        }
        return null;
    }
    //Search by ID  
    public void searchByID(int idPhucNH){
        boolean foundPhucNH = false;
        for(Media mediaPhucNH : itemsOrderedPhucNH){
            if(mediaPhucNH.getIdPhucNH() == idPhucNH){
                foundPhucNH = true;
                mediaPhucNH.print();
            }
        }
        if(!foundPhucNH){
            System.out.println("Ngo Hoang Phuc 20225903. Not found media!");
        }
    }

    // Method to search for DVDs in the cart by title and print the results
    public void searchByTitle(String titlePhucNH){
        boolean foundPhucNH = false;
        for(Media mediaPhucNH : itemsOrderedPhucNH){
            if(mediaPhucNH.isMatchPhucNH(titlePhucNH)){
                foundPhucNH = true;
                mediaPhucNH.print();
            }
        }
        if(!foundPhucNH){
            System.out.println("Ngo Hoang Phuc 20225903. Not found media!");
        }
    }
    //Create order method
    public void emptyCartPhucNH(){
        itemsOrderedPhucNH.clear();
        System.out.println("Ngo Hoang Phuc 20225903. Order created!");
    }
    //Get items ordered method
    public List<Media> getItemsOrderedPhucNH(){
        return itemsOrderedPhucNH;
    }
    //Sort media by title method
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrderedPhucNH, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrderedPhucNH.iterator();
        iterator = itemsOrderedPhucNH.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    //Sort media by cost method
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrderedPhucNH, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrderedPhucNH.iterator();
        iterator = itemsOrderedPhucNH.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
}