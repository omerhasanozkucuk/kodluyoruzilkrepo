import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n ,k ,total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Üstü alıncak sayıyı girin : ");
        n = input.nextInt();
        System.out.println("üs oluçak sayıyı girin : ");
        k = input.nextInt();

        for(int i = 1 ; i < k ; i++){
            total *= n;
        }
        System.out.println(n + " sayısının " + k + ". üstü : " + total);
    }
}
