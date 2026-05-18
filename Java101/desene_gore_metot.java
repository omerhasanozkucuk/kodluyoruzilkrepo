import java.util.Scanner;

public class Main {

    static void path(int a){

        System.out.println(a);
        if(a > 0) {
            path(a - 5);
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz : ");
        int a = scn.nextInt();
        if(a <= 0){
            System.out.println("Yanlis bir sayi girdiniz ");
        }else{
            path(a);
        }

    }
}
