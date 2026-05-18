import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1 ,n2 ,n3;
        Scanner scn = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = scn.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = scn.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin");
        System.out.println("1-Toplama 2-Çıkarma 3-Bölme 4-Çarpma" );
        n3 = scn.nextInt();
        switch(n3){
            case 1:
                System.out.println("Toplamanın sonucu : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarmanın sonucu : " + (n1-n2));
                break;
            case 3:
                if(n2 == 0){
                    System.out.println("Bir sayı 0'a bölünemez");
                }else{
                    System.out.println("Bölmenin sonucu : " + (n1 / n2));
                }
                break;
            case 4:
                System.out.println("Çarpmanın sonucu : " + (n1*n2));
                break;
            default:
                System.out.println("Olmayan bir işlem seçmeye çalışltınız");
                break;




        }

    }

}
