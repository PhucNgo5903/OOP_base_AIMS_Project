package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    // Maximum number of ordered items allowed in the cart
    public static final int MAX_NUMBERS_ORDERED_PhucNH = 20;

    // Array to hold the DigitalVideoDisc items ordered
    private DigitalVideoDisc itemsOrderedPhucNH[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED_PhucNH];

    // Quantity of items currently ordered
    private int qtyOrderedPhucNH = 0;

    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc discPhucNgo) {
        // Check if there is space to add another disc
        if (qtyOrderedPhucNH < MAX_NUMBERS_ORDERED_PhucNH) {
            itemsOrderedPhucNH[qtyOrderedPhucNH] = discPhucNgo; // Add the disc to the cart
            qtyOrderedPhucNH++; // Increment the quantity ordered
            System.out.println("Ngo Hoang Phuc 20225903. The disc has been added.");
        } else {
            // Inform the user if the cart is full
            System.out.println("Ngo Hoang Phuc 20225903. The cart is almost full.");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdListPhucNgo) {
        if (dvdListPhucNgo.length > MAX_NUMBERS_ORDERED_PhucNH) {
            System.out.println("Ngo Hoang Phuc 20225903. The cart is almost full!");
        } else {
            for (int i = 0; i < dvdListPhucNgo.length; i++) {
                itemsOrderedPhucNH[qtyOrderedPhucNH] = dvdListPhucNgo[i];
                System.out.println("Ngo Hoang Phuc 20225903. " + dvdListPhucNgo[i].getTitlePhucNH() + " has been added!");
                qtyOrderedPhucNH +=1 ;
            }
    
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1PhucNgo,DigitalVideoDisc dvd2PhucNgo) {
        DigitalVideoDisc [] dvdListPhucNgo = {dvd1PhucNgo, dvd2PhucNgo};
        addDigitalVideoDisc(dvdListPhucNgo);
    }
    


    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc discPhucNgo) {
        boolean foundPhucNH = false; // Flag to check if the disc is found
        // Iterate through the ordered items to find the disc
        for (int i = 0; i < qtyOrderedPhucNH; i++) {
            // Check if the current item matches the disc to be removed
            if (itemsOrderedPhucNH[i] == discPhucNgo) {
                foundPhucNH = true; // Set the flag to true if found
                // Shift items down to remove the disc from the cart
                for (int j = i; j < qtyOrderedPhucNH - 1; j++) {
                    itemsOrderedPhucNH[j] = itemsOrderedPhucNH[j + 1];
                }
                itemsOrderedPhucNH[qtyOrderedPhucNH - 1] = null; // Nullify the last item
                qtyOrderedPhucNH--; // Decrement the quantity ordered
                System.out.println("Ngo Hoang Phuc 20225903. The disc has been removed.");
                break; 
            }
        }
        // Inform the user if the disc was not found
        if (!foundPhucNH) {
            System.out.println("Ngo Hoang Phuc 20225903. The disc is not found in the cart.");
        }
    }

    // Method to calculate the total cost of items in the cart
    public float totalCost() {
        float totalPhucNH = 0; // Initialize total cost
        // Iterate through the ordered items to calculate the total cost
        for (int i = 0; i < qtyOrderedPhucNH; i++) {
            totalPhucNH += itemsOrderedPhucNH[i].getCostPhucNH(); // Add the cost of each item
        }
        return totalPhucNH; 
    }


    
    
    public void print() {
        System.out.println("**********************************************Ngo Hoang Phuc 20225903 CART**********************************************");
        System.out.println("Ngo Hoang Phuc 20225903. Ordered Items:");
        for (int i = 0; i < qtyOrderedPhucNH; i++) {
            System.out.println("Ngo Hoang Phuc 20225903. " + (i+1) + ". " + "DVD - " + itemsOrderedPhucNH[i].getTitlePhucNH() 
            + " - " + itemsOrderedPhucNH[i].getCategoryPhucNH() + " - " + itemsOrderedPhucNH[i].getDirectorPhucNH() + " - " + 
            itemsOrderedPhucNH[i].getLengthPhucNH() + ": " + itemsOrderedPhucNH[i].getCostPhucNH() + "$");
        }
        System.out.println("Ngo Hoang Phuc 20225903. Total cost: " + totalCost());
        System.out.println("************************************************************************************************************************");
    }

    public void searchByID(int idPhucNH){
        boolean found = false;
        for(int i = 0; i< qtyOrderedPhucNH; i++){
            if(itemsOrderedPhucNH[i].getIdPhucNH() == idPhucNH){
                System.out.println("Ngo Hoang Phuc 20225903. Found" + itemsOrderedPhucNH[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Ngo Hoang Phuc 20225903. Sorry, no DVDs were found with the ID provided!");
        }
    }

    public void searchByTitle(String keywordPhucNH){
        boolean found = false;
        for (int i = 0; i< qtyOrderedPhucNH; i++){
            if(itemsOrderedPhucNH[i].isMatchPhucNH(keywordPhucNH)){
                System.out.println("Ngo Hoang Phuc 20225903. Found " + itemsOrderedPhucNH[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Ngo Hoang Phuc 20225903. Sorry, no DVDs were found with \"" + keywordPhucNH + "\" in the title!");
        }
    }


}