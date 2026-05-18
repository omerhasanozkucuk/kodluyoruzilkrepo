import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        int n , total =0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Sayı girin : ");
            n = sc.nextInt();
            if (n % 4 == 0){
                total +=n ;
            }
        }
        while (n % 2 == 0);
        System.out.println("Total : " + total);
    }
}
