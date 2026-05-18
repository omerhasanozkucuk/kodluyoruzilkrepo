import java.util.Scanner;

public class main {
    public  static void main(String[] args) {
        int n ;
        double result = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("N sayısını giriniz ");
        n = sc.nextInt();

        for(double i = 1;i<=n;i++) {
              result +=  1/i;
        }
        System.out.println(result );
    }
}
