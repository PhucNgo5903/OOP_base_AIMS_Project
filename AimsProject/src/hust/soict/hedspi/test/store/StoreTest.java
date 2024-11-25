package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store storePhucNH = new Store();
        
        DigitalVideoDisc dvd1PhucNH = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        //Add new DVD to store
        storePhucNH.addDVDPhucNH(dvd1PhucNH);

        DigitalVideoDisc dvd2PhucNH = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        //Add new DVD to store
        storePhucNH.addDVDPhucNH(dvd2PhucNH);

        DigitalVideoDisc dvd3PhucNH = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        //Add new DVD to store
        storePhucNH.addDVDPhucNH(dvd3PhucNH);

        //Print DVD list of store
        storePhucNH.printPhucNH();   
        //Remove DVD from store
        storePhucNH.removeDVDPhucNH(dvd2PhucNH);

        storePhucNH.printPhucNH();   
    }

}