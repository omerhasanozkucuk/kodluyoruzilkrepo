import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1 , n2 , n3 , n4  ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("Enter third number: ");
        n3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        n4 = input.nextInt();
        int max = n1;
        int min = n2;
        if (n2>max){
            max = n2;
        }if (n3>max){
            max = n3;
        }if (n4>max){
            max = n4;
        }
        System.out.println("The maximum number is "+max);

        if(min>n1){
            min = n1;
        } if(min>n3){
            min = n3;
        } if(min>n4){
            min = n4;
        }
        System.out.println("The minimum number is "+min);
        }
        }


