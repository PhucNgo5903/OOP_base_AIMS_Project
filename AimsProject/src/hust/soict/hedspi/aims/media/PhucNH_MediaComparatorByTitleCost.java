package hust.soict.hedspi.aims.media;
import java.util.Comparator;

public class PhucNH_MediaComparatorByTitleCost implements Comparator<PhucNH_Media> {
	@Override
	public int compare(PhucNH_Media o1, PhucNH_Media o2) {
		if (o1.getTitle().compareTo(o2.getTitle()) != 0) {
			return o1.getTitle().compareTo(o2.getTitle());
		} else {
			if (o1.getCost() > o2.getCost())
				return 1;
			else
				return -1;
		}
	}
}