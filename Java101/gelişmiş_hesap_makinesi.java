import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner input = new Scanner(System.in);
        System.out.println("toplamak istediginiz sayiyi giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("iki sayinin toplami : " + sum);


    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.println("cikarmak istediginiz sayilari girin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int minus = a - b;
        System.out.println("iki sayinin farki : " + minus);
    }

    static void multiply(){
        Scanner input = new Scanner(System.in);
        System.out.println("carpmak istediginiz sayiyi girin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a * b;
        System.out.println("iki sayinin carpimi : " + sum);
    }
    static void divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("bolmek istediginiz sayiyi girin:");
        int a = input.nextInt();
        int b = input.nextInt();
        if (b == 0)
            System.out.println("bir sayi 0'a bolunmez");

        int divide = a / b;
        System.out.println("iki sayinin bolumu : " + divide);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ustunu almak istediginiz sayiyi ardindan ustunu girin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int power = 1;
        for (int i = 0; i <= b; i++) {
            power *= a ;
        }
        System.out.println("sayinin ustu : " + power);

    }

    static void fact(){
        Scanner scan = new Scanner(System.in);
        System.out.print(" faktoryel alincak sayıyi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print(" modu alincak sayiyi giriniz :");
        int n = input.nextInt();
        System.out.println("mod olcak sayiyi giriniz :");
        int m = input.nextInt();
        int result = n % m;
        System.out.println("mod : " + result);
    }

    static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print(" dikdortgenin farkli 2 kenarini giriniz :");
        int a = input.nextInt();
        int b = input.nextInt();
        int area = (a * b) ;
        int cev = 2*(a*b);
        System.out.println("alan : " + area);
        System.out.println("cevre : " + cev);
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while(true) {
            System.out.println("Lutfen yapmak istediginiz islemi secin");
            System.out.println(menu);
            select = scan.nextInt();
            if(select == 0)
                break;

            switch (select) {
                case 1:

                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                     area();
                     break;
                default:
                     System.out.println("yanlis bir tuslama yaptiniz");
            }
        }
        System.out.println("gule gule");


    }
}
