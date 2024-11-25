package hust.soict.hedspi.test.cart;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cartPhucNH = new Cart();
        
         DigitalVideoDisc dvd1PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. The Lion King PhucNgo", // Title
            "Animation PhucNgo", // Category
            "Roger Allers PhucNgo", // Director
            87, // Length in minutes
            19.95f // Cost
        );
         cartPhucNH.addDigitalVideoDisc(dvd1PhucNH); // Add the first DVD to the cart
        // Create a new DigitalVideoDisc instance for "Star Wars"
        DigitalVideoDisc dvd2PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. Star Wars PhucNgo", // Title
            "Science Fiction PhucNgo", // Category
            "George Lucas PhucNgo", // Director
            87, // Length in minutes
            24.95f // Cost
        );
        cartPhucNH.addDigitalVideoDisc(dvd2PhucNH); // Add the second DVD to the cart
        // Create a new DigitalVideoDisc instance for "Aladdin"
        DigitalVideoDisc dvd3PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. Aladin PhucNgo", // Title
            "Animation PhucNgo", // Category
            18.99f // Cost
        );

        cartPhucNH.print();
        cartPhucNH.searchByID(2);
        cartPhucNH.searchByTitle("Lion");
    }
}