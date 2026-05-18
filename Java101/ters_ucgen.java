import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç basamaklı olacağını girin :");
        n = input.nextInt();
        int count = n;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (2*count-1); j++){
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
}
