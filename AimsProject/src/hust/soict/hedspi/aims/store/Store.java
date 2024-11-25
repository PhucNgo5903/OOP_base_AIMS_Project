package hust.soict.hedspi.aims.store;
import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    // A list to hold the DigitalVideoDisc items currently in the store.
    private List<DigitalVideoDisc> itemsInStorePhucNH = new ArrayList<DigitalVideoDisc>();
    //Adds a DigitalVideoDisc to the store.
    public void addDVDPhucNH(DigitalVideoDisc dvdPhucNH) {
        itemsInStorePhucNH.add(dvdPhucNH);
        System.out.println(dvdPhucNH.getTitlePhucNH() + " has been added to the store.");
    }
    //Removes a DigitalVideoDisc from the store.
    public void removeDVDPhucNH(DigitalVideoDisc dvdPhucNH) {
        boolean removed = itemsInStorePhucNH.remove(dvdPhucNH);
        if (removed) {
            System.out.println(dvdPhucNH.getTitlePhucNH() + " has been removed from the store.");
        } else {
            System.out.println(dvdPhucNH.getTitlePhucNH() + " is not found in the store.");
        }
    }
    //Prints the list of all DigitalVideoDisc items in the store.
    public void printPhucNH() {
        for (int i = 0; i < itemsInStorePhucNH.size(); i++) {
            System.out.println(i+1 + ". " + itemsInStorePhucNH.get(i));
        }
    }

}