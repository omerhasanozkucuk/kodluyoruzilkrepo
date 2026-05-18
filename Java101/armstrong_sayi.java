import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int number ;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("hesaplanıcak sayıyı giriniz : ");
        number = input.nextInt();

        do {
            int sayi = number % 10;
            sum += sayi;
            number /= 10;
        } while(number !=0);


        System.out.println(sum);
    }
}
