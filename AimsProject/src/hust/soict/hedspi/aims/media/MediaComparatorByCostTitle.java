package hust.soict.hedspi.aims.media;

import java.util.Comparator;
//MediaComparatorByCostTitle Class
public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1PhucNH, Media o2PhucNH){
        if(o1PhucNH.getCostPhucNH() > o2PhucNH.getCostPhucNH()){
            return -1;
        } else if (o1PhucNH.getCostPhucNH() < o2PhucNH.getCostPhucNH()){
            return 1;
        }else{
            if(o1PhucNH.getTitlePhucNH() != null && o2PhucNH.getTitlePhucNH() != null)
                return -o1PhucNH.getTitlePhucNH().compareTo(o2PhucNH.getTitlePhucNH());
            if(o1PhucNH.getTitlePhucNH() == null && o2PhucNH.getTitlePhucNH() == null)
                return -1;
            return 0;
        }

    }

}