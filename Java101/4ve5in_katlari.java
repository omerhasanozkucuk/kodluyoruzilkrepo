import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sınır sayıyı giriniz :");
        n = input.nextInt();
        for (int i = 1; i <= n; i*=4) {
            System.out.println(i + " : 4'ün kuvvetidir");
        }
        System.out.println("--------------");
        for (int i = 1; i <= n; i*=5) {
            System.out.println(i + " : 5'in kuvvetleri" );
        }


    }
}
