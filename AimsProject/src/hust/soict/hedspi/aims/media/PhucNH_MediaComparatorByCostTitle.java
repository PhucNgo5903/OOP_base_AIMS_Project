package hust.soict.hedspi.aims.media;
import java.util.Comparator;

public class PhucNH_MediaComparatorByCostTitle implements Comparator<PhucNH_Media> {
	@Override
    public int compare(PhucNH_Media o1, PhucNH_Media o2) {
        if(o1.getCost() != o2.getCost()) {
            int i = (int) (o1.getCost() - o2.getCost());
            return i;
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}