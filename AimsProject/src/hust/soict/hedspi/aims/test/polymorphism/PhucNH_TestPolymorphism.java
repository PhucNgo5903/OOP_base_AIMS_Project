package hust.soict.hedspi.aims.test.polymorphism;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.List;

public class PhucNH_TestPolymorphism {
	public static void main(String[] args) {
		List<PhucNH_Media> mediae = new ArrayList<PhucNH_Media>();
		PhucNH_DigitalVideoDisc dvd = new PhucNH_DigitalVideoDisc(1, "Jurassic World", "Action", 17.75f, "Colin Trevorrow", 124);

		ArrayList<PhucNH_Track> tracks = new ArrayList<PhucNH_Track>();
		tracks.add(new PhucNH_Track("Like I'm gonna lose you", 4));
		tracks.add(new PhucNH_Track("Let me down slowly", 3));
		PhucNH_CompactDisc cd = new PhucNH_CompactDisc(2, "Ban nhac buon", "Nhac Au - My", 3.5f, "Various artists", tracks);

		List<String> authors = new ArrayList<String>();
		authors.add("Fujiko F. Fujio");
		PhucNH_Book book = new PhucNH_Book(3, "Doraemon", "Manga", 0.79f, authors);

		mediae.add(dvd);
		mediae.add(cd);
		mediae.add(book);

		for (PhucNH_Media item : mediae) {
			System.out.println(item);
		}
	}
}