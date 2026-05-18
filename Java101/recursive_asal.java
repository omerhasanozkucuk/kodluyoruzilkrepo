import java.util.Scanner;

public class Main {

    static boolean primeControl(int n, int bolen) {

        if (n < 2)
            return false;

        if (bolen * bolen > n)
            return true;

        if (n % bolen == 0)
            return false;


        return primeControl(n, bolen + 1);
    }

    static boolean prime(int n) {
        return primeControl(n, 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asal sayi kontrolu icin bir sayi giriniz :");
        int sayi = input.nextInt();
        if (prime(sayi)){
            System.out.println(sayi + " asaldi");
        }else{
            System.out.println(sayi + "asal degildir");
        }

    }
}
