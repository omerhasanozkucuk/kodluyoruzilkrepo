import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double gidilenKM , tutar , kmFiyatı = 2.20 , acılışTutar = 10.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen KM : ");
        gidilenKM = input.nextDouble();
        tutar = (gidilenKM * kmFiyatı) + acılışTutar;


        // bunun yerine koşu operatörü ile tutar = (tutar <20) ? 20 : tutar;
        // şu demek tutar 20den küçükse yani koşul doğruysa 1. ifade(20) koşul yalışsa 2. ifade
        if (tutar < 20) {
            System.out.println("İndi bindi ücreti 20Tl 'dir");
        }else{
            System.out.println("Ödenecek tutar : " + tutar);
        }



    }
}
