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
        anOrderPhucNH.addDigitalVideoDisc(dvd1PhucNH); // Add the first DVD to the cart
        // Create a new DigitalVideoDisc instance for "Star Wars"
        DigitalVideoDisc dvd2PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. Star Wars PhucNgo", // Title
            "Science Fiction PhucNgo", // Category
            "George Lucas PhucNgo", // Director
            87, // Length in minutes
            24.95f // Cost
        );
        anOrderPhucNH.addDigitalVideoDisc(dvd2PhucNH); // Add the second DVD to the cart
        // Create a new DigitalVideoDisc instance for "Aladdin"
        DigitalVideoDisc dvd3PhucNH = new DigitalVideoDisc(
            "Ngo Hoang Phuc 20225903. Aladin PhucNgo", // Title
            "Animation PhucNgo", // Category
            18.99f // Cost
        );
        anOrderPhucNH.addDigitalVideoDisc(dvd3PhucNH); // Add the third DVD to the cart 
        Print the total cost of items in the cart
        System.out.println("Ngo Hoang Phuc 20225903. Total Cost is: ");
        System.out.println(anOrderPhucNH.totalCost());
        Remove the first DVD from the cart
        anOrderPhucNH.removeDigitalVideoDisc(dvd3PhucNH);
    }
}