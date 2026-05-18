import java.util.Scanner;

public class main {
    public  static void main(String[] args) {
        int k,count=0,sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Üst sınır olçak olan sayıyı girin : ");
        k = sc.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
                System.out.println(i);

            }

        }
        System.out.println("Girdiğiniz sayıya kadar olan 3 ve 4'e bölünebilen sayıların " +
                "ortalaması :" + (sum/count));
    }
}
