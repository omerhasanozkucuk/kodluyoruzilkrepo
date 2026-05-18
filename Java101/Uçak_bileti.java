import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mesafe , yaş , tip ;
        double price , kmPrice = 0.10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz : ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yaş = input.nextInt();
        if(yaş < 0 ){
            System.out.println("Hatalı veri girdiniz");
        }
        System.out.println("Uçuş tipiniz giriniz : ");
        tip = input.nextInt();
        if(!(tip == 1 || tip == 2)){
            System.out.println("Hatalı veri girdiniz");
        }
        switch(tip){
            case 1:
                price = mesafe * kmPrice;
                if(yaş < 12){
                    price *= 0.50;
                }else if(yaş > 12 && yaş < 24){
                    price *= 0.90;
                }else if (yaş > 65){
                    price *= 0.70;
                }
                System.out.println("Bilet tutarınız : " + price);
                break;
            case 2:
                price = 2 * mesafe * kmPrice;
                if(yaş < 12){
                    price *= 0.50;
                }else if(yaş > 12 && yaş < 24){
                    price *= 0.90;
                }else if (yaş > 65){
                    price *= 0.70;
                }
                price *= 0.80;
                System.out.println("Bilet tutarınız : " + price);
                break;

             default:
        }

    }
}
