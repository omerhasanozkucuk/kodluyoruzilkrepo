import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       int yıl;
       boolean varr1 , varr2 , varr3 ;
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen merak ettiğiniz yılı giriniz :");
       yıl = input.nextInt();
       varr1 = (yıl % 4)==0;
       varr2 = (yıl % 100)==0;
       varr3 = (yıl % 400)==0;

       if(varr1==true && varr2==true && varr3==true){
           System.out.println(yıl + " : Artık yıldır");
       }else if(varr1==true && varr2==true && varr3==false){
           System.out.println(yıl + " : Artık yıl değildir");
       }else if(varr1==true && varr2==false && varr3==false){
           System.out.println(yıl + " : Artık yıldır");
       }else {
           System.out.println(yıl + " : Artık yıl değildir");
       }

    }
}
