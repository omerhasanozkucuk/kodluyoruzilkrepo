import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1 , n2 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        int ebob = n1 ;
        int ekok = 1   ;

        while(ebob != 1){
            if(n1 % ebob ==0 && n2 % ebob ==0){
                System.out.println(ebob + " ebobtur" );
                break;
            }else {
                ebob--;
            }

        }
        while( ekok <= n1*n1){
            if (ekok % n1 ==0 && ekok % n2 ==0) {
                System.out.println(ekok + " ekoktur" );
                break;
            }else
                ekok++;

        }
    }
}
