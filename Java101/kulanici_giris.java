import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      String klc , psw ;

      Scanner scn = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınınızı girin : ");
        klc = scn.nextLine();
        System.out.println("Lütfen şifrenizi  girin : ");
        psw = scn.nextLine();

        if(klc.equals("java") && psw.equals("123456")){
            System.out.println("Sisteme giriş yaptınız");
        }else{
            System.out.println("Girdiğiniz bilgiler yanlış");
            System.out.println("Şifrenizi sıfırlamak isterseniz 1'i çıkış yampak için 2'yi seçin");
            int n  = scn.nextInt();
            switch(n){
                case 1:
                    System.out.println("Yeni şifrenizi girin : " );
                    String psw2 ;
                    Scanner scn2 = new Scanner(System.in);
                    psw2 = scn2.nextLine();

                    if (psw2.equals("123456")){
                        System.out.println("Şifreniz oluşturulamadı");
                    }else{
                        System.out.println("Şifreniz başarıyla oluştu");
                    }
                    break;
                case 2:
                    System.out.println("Şifrenizi hatırladığınızda görüşürüz");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
                    break;
            }

        }
    }
}
