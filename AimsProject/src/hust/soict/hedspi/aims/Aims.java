package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrderPhucNH = new Cart(); // Create a new Cart instance to hold the order
        // Create a new DigitalVideoDisc instance for "The Lion King"
        DigitalVideoDisc dvd1PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. The Lion King PhucNgo", // Title
            "Animation PhucNgo", // Category
            "Roger Allers PhucNgo", // Director
            87, // Length in minutes
            19.95f // Cost
        );
        
        // Create a new DigitalVideoDisc instance for "Star Wars"
        DigitalVideoDisc dvd2PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. Star Wars PhucNgo", // Title
            "Science Fiction PhucNgo", // Category
            "George Lucas PhucNgo", // Director
            87, // Length in minutes
            24.95f // Cost
        );
        
        // Create a new DigitalVideoDisc instance for "Aladdin"
        DigitalVideoDisc dvd3PhucNH = new DigitalVideoDisc(
            "Animation PhucNgo", // Category
            "Ngo Hoang Phuc 20225903. Aladin PhucNgo", // Title
            18.99f // Cost
        );
       
        anOrderPhucNH.addDigitalVideoDisc(dvd1PhucNH, dvd2PhucNH);  
        // DigitalVideoDisc[] dvdListPhucNgo = {dvd2PhucNH, dvd3PhucNH};
        //anOrderPhucNH.addDigitalVideoDisc(dvdListPhucNgo);

        //Print the total cost of items in the cart
        //anOrderPhucNH.addDigitalVideoDisc(dvd1PhucNH, dvd2PhucNH);
        // System.out.println("Ngo Hoang Phuc 20225903. Total Cost is: ");
        // System.out.println(anOrderPhucNH.totalCost());
        //Remove the first DVD from the cart
        // anOrderPhucNH.removeDigitalVideoDisc(dvd2PhucNH);
        // anOrderPhucNH.print();  
    }
}

