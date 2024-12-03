package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare (Media o1, Media o2) {
        try {
            if (o1.getTitlePhucNH().compareTo(o2.getTitlePhucNH()) > 0) {
                return -1;
            } else if (o1.getTitlePhucNH().compareTo(o2.getTitlePhucNH()) < 0) {
                return 1;
            } else {
                if (o1.getCostPhucNH() > o2.getCostPhucNH()) {
                    return -1;
                } else if (o1.getCostPhucNH() < o2.getCostPhucNH()) {
                    return 1;
                }
            }
        } catch (NullPointerException e) {
            if (o1.getTitlePhucNH() == null && o2.getTitlePhucNH() == null)
                return -1;
            if (o1.getTitlePhucNH() != null && o2.getTitlePhucNH() == null)
                return -1;
            if (o1.getTitlePhucNH() == null && o2.getTitlePhucNH() != null)
                return 1;
        }
        return 0;
    }
}