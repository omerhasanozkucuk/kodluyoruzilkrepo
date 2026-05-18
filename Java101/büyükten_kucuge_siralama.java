import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a , b, c ;

        Scanner scn = new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        a = scn.nextInt();
        System.out.println("2. sayıyı girin");
        b = scn.nextInt();
        System.out.println("3. sayıyı girin");
        c = scn.nextInt();
        boolean i = (a > b);
        boolean j = (b > c);
        boolean k = (a > c);
        if (i){
            if (j){
                System.out.println("Büyükten küçüğe " +a + b + c);
            }else if (k){
                System.out.println("Büyükten küçüğe " +a + c + b);
            }else{
                System.out.println("Büyükten küçüğe " +c + a + b );
            }
        }else if (j){
            if (k){
                System.out.println("Büyükten küçüğe " +b + a + c);
            }else{
                System.out.println("Büyükten küçüğe " +b + c + a);
            }
        }else if (!k){
            System.out.println("Büyükten küçüğe " +c + b + a);
        }



    }
}
