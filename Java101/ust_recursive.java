import java.util.Scanner;

public class Main {


    static int power(int a, int b){
        if(b == 0)
            return 1;

        return a*power(a,b-1);

    }

    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("ustu alincak sayiyi giriniz: ");
        int n = input.nextInt();
        System.out.println("sayini ustunu giriniz: ");
        int m = input.nextInt();
        System.out.println(n + " sayisinin " + m + ". ustu : " + power(n, m));

    }
}
