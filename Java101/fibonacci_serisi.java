import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Fibonacci Serisi için basamak sayısı giriniz: ");
        int number=scanner.nextInt();
        int a =0,b=1,c=0;

        for(int i =0; i<number; i++){
            c= a + b;
            System.out.println(a + " + " + b +" = " +c);
            a=b;
            b=c;
        }
    }
}
