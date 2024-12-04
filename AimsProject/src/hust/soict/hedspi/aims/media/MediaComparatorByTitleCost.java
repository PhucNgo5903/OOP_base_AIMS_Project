package hust.soict.hedspi.aims.media;

import java.util.Comparator;
//MediaComparatorByTitleCost Class
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare (Media o1PhucNH, Media o2PhucNH) {
        try {
            if (o1PhucNH.getTitlePhucNH().compareTo(o2PhucNH.getTitlePhucNH()) > 0) {
                return -1;
            } else if (o1PhucNH.getTitlePhucNH().compareTo(o2PhucNH.getTitlePhucNH()) < 0) {
                return 1;
            } else {
                if (o1PhucNH.getCostPhucNH() > o2PhucNH.getCostPhucNH()) {
                    return -1;
                } else if (o1PhucNH.getCostPhucNH() < o2PhucNH.getCostPhucNH()) {
                    return 1;
                }
            }
        } catch (NullPointerException e) {
            if (o1PhucNH.getTitlePhucNH() == null && o2PhucNH.getTitlePhucNH() == null)
                return -1;
            if (o1PhucNH.getTitlePhucNH() != null && o2PhucNH.getTitlePhucNH() == null)
                return -1;
            if (o1PhucNH.getTitlePhucNH() == null && o2PhucNH.getTitlePhucNH() != null)
                return 1;
        }
        return 0;
    }
}