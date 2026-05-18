import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double kdvOranı = 0.18;
        double urunFiyatı ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatı girin");
        urunFiyatı = input.nextDouble();
        double kdvTutar = urunFiyatı * kdvOranı;
        System.out.println("KDV tutarı : " + kdvTutar);
        System.out.println("KDV'li ürün fiyatı : " + (kdvTutar + urunFiyatı));
        System.out.println("KDV'siz fiyat : " + urunFiyatı);
        System.out.println("KDV oranı : " + kdvOranı);

    }
}
