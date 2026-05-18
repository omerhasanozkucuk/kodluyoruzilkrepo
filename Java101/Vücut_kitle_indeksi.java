import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double boy , kilo , VKE ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden girin : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu kg cinsinden girin : ");
        kilo = input.nextDouble();
        VKE = kilo / (boy * boy);
        System.out.println("Vücüt kitle endeksiniz : " + VKE);


    }
}
