package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // Create two DigitalVideoDisc objects with titles "Jungle PhucNH" and "Cinderella PhucNH"
        DigitalVideoDisc jungleDVDPhucNH = new DigitalVideoDisc("Jungle PhucNH");
        DigitalVideoDisc cinderellaDVDPhucNH = new DigitalVideoDisc("Cinderella PhucNH");
        // Attempt to swap the two DVD objects and print result
        swap(jungleDVDPhucNH, cinderellaDVDPhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Jungle dvd title: " + jungleDVDPhucNH.getTitlePhucNH());
        System.out.println("Ngo Hoang Phuc 20225903. Cinderella dvd title: " + cinderellaDVDPhucNH.getTitlePhucNH());

        // Change the title of "jungleDVDPhucNH" to the title of "cinderellaDVDPhucNH"
        changeTitle(jungleDVDPhucNH, cinderellaDVDPhucNH.getTitlePhucNH());
        // Print the title of the "jungleDVDPhucNH" object after the title change
        System.out.println("Ngo Hoang Phuc 20225903. Jungle dvd title: " + jungleDVDPhucNH.getTitlePhucNH());
    }

    // This method attempts to swap the two objects o1PhucNH and o2PhucNH
    public static void swap(Object o1PhucNH, Object o2PhucNH) {
        Object tmpPhucNH = o1PhucNH;
        o1PhucNH = o2PhucNH;
        o2PhucNH = tmpPhucNH;   
    }

    // This method changes the title of a given DigitalVideoDisc object to a new title
    public static void changeTitle(DigitalVideoDisc dvdPhucNH, String titlePhucNH) {
        String oldTitlePhucNH = dvdPhucNH.getTitlePhucNH();
        dvdPhucNH.setTitlePhucNH(titlePhucNH);
        dvdPhucNH = new DigitalVideoDisc(oldTitlePhucNH);
    }
}