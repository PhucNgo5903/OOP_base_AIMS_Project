package hust.soict.hedspi.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random rPhucNH = new Random(123);
        // Using + operator
        long startPhucNH = System.currentTimeMillis();
        String sPhucNH = "";
        for (int i = 0; i < 65536; i ++) {
            sPhucNH += rPhucNH.nextInt(2);
        }
        System.out.println("Ngo Hoang Phuc 20225903. Using + operator: " + (System.currentTimeMillis() - startPhucNH) + "ms");
        
        // Using StringBuffer
        rPhucNH = new Random(123);
        startPhucNH = System.currentTimeMillis();
        StringBuffer sbPhucNH = new StringBuffer();
        for (int i = 0; i < 65536; i ++) {
            sbPhucNH.append(rPhucNH.nextInt(2));
        }
        sPhucNH = sbPhucNH.toString();
        System.out.println("Ngo Hoang Phuc 20225903. Using StringBuffer: " + (System.currentTimeMillis() - startPhucNH) + "ms");
        
        // Using StringBuilder
        rPhucNH = new Random(123);
        startPhucNH = System.currentTimeMillis();
        StringBuilder sb2PhucNH = new StringBuilder();
        for (int i = 0; i < 65536; i ++) {
            sb2PhucNH.append(rPhucNH.nextInt(2));
        }
        sPhucNH = sb2PhucNH.toString();
        System.out.println("Ngo Hoang Phuc 20225903. Using StringBuilder: " + (System.currentTimeMillis() - startPhucNH) + "ms");
    }
}