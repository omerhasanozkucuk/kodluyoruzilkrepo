import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean yaziTura = random.nextBoolean(); // %50 true, %50 false

        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Ring r = new Ring(marc,alex , 90 , 100);

        if (yaziTura) {
            r.run1();
        } else {
            r.run2();

        }

    }
}
