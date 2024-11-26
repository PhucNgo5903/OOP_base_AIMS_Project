package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // Create two DigitalVideoDisc objects with titles "Jungle PhucNH" and "Cinderella PhucNH"
        DigitalVideoDisc jungleDVDPhucNH = new DigitalVideoDisc("Jungle PhucNH");
        DigitalVideoDisc cinderellaDVDPhucNH = new DigitalVideoDisc("Cinderella PhucNH");

        DigitalVideoDiscWrapper wjungleDVDPhucNH = new DigitalVideoDiscWrapper(jungleDVDPhucNH);
        DigitalVideoDiscWrapper wcinderellaDVDPhucNH = new DigitalVideoDiscWrapper(cinderellaDVDPhucNH);

        // Attempt to swap the two DVD objects and print result
        swap(jungleDVDPhucNH, cinderellaDVDPhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Jungle dvd title: " + jungleDVDPhucNH.getTitlePhucNH());
        System.out.println("Ngo Hoang Phuc 20225903. Cinderella dvd title: " + cinderellaDVDPhucNH.getTitlePhucNH());

        // Correct swap() function
        swap(wjungleDVDPhucNH, wcinderellaDVDPhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Correct swapped jungle dvd title: " + wjungleDVDPhucNH.dvdPhucNH.getTitlePhucNH());
        System.out.println("Ngo Hoang Phuc 20225903. Correct swapped cinderella dvd title: " + wcinderellaDVDPhucNH.dvdPhucNH.getTitlePhucNH());

        // Change the title of "jungleDVDPhucNH" to the title of "cinderellaDVDPhucNH"
        changeTitle(jungleDVDPhucNH, cinderellaDVDPhucNH.getTitlePhucNH());
        // Print the title of the "jungleDVDPhucNH" object after the title change
        System.out.println("Ngo Hoang Phuc 20225903. Jungle dvd title: " + jungleDVDPhucNH.getTitlePhucNH());
    }

    //This method attempts to swap the two objects o1PhucNH and o2PhucNH
    public static void swap(Object o1PhucNH, Object o2PhucNH) {
        Object tmpPhucNH = o1PhucNH;
        o1PhucNH = o2PhucNH;
        o2PhucNH = tmpPhucNH;   
    }
    // Correct swap() function
    public static void swap(DigitalVideoDiscWrapper o1PhucNH, DigitalVideoDiscWrapper o2PhucNH) {
        DigitalVideoDisc tmpPhucNH = o1PhucNH.dvdPhucNH;
        o1PhucNH.dvdPhucNH = o2PhucNH.dvdPhucNH;
        o2PhucNH.dvdPhucNH = tmpPhucNH;
    }

    // This method changes the title of a given DigitalVideoDisc object to a new title
    public static void changeTitle(DigitalVideoDisc dvdPhucNH, String titlePhucNH) {
        String oldTitlePhucNH = dvdPhucNH.getTitlePhucNH();
        dvdPhucNH.setTitlePhucNH(titlePhucNH);
        dvdPhucNH = new DigitalVideoDisc(oldTitlePhucNH);
    }
}