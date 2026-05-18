
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double a ,armut = 2.14 ;
        double e ,elma = 3.67;
        double d ,domates = 1.11;
        double m ,muz = 0.95;
        double p ,patlıcan = 5.00;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen kaç kg armut aldığınızı girin : ");
        a = scn.nextDouble();
        System.out.println("Lütfen kaç kg elma aldığınızı girin : ");
        e = scn.nextDouble();
        System.out.println("Lütfen kaç kg domates aldığınızı girin : ");
        d = scn.nextDouble();
        System.out.println("Lütfen kaç kg muz aldığınızı girin : ");
        m = scn.nextDouble();
        System.out.println("Lütfen kaç kg patlıcan aldığınızı girin : ");
        p = scn.nextDouble();
        double tutar = (a*armut) + (e*elma) + (d*domates) + (m*muz) + (p*patlıcan) ;
        System.out.println("Sepetininzin tutarı : " + tutar );


    }
}
