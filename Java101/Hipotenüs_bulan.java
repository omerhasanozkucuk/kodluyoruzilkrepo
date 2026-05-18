import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double kenar1 , kenar2 , kenar3 , u, alan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. kenarının uzunluğunu girin : ");
        kenar1 = scan.nextDouble();
        System.out.println("Lütfen 2. kenarının uzunluğunu girin : ");
        kenar2 = scan.nextDouble();
        System.out.println("Lütfen 3. kenarının uzunluğunu girin : ");
        kenar3 = scan.nextDouble();
        u = kenar1 + kenar2 + kenar3;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin alanı : " + alan);

    }
}
