import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      int mat , fiz , kim , mzk , trk ;

      Scanner input = new Scanner(System.in);

      System.out.println("Matemetik notunuzu girin : ");
      mat = input.nextInt();
      mat = (mat <= 100 && mat > 0)? mat : 0;
      System.out.println("Fizki notunuzu girin : ");
      fiz = input.nextInt();
      fiz = (fiz <= 100 && fiz > 0)? fiz : 0;
      System.out.println("Kİmya notunuzu girin : ");
      kim = input.nextInt();
      kim = (kim <= 100 && kim > 0)? kim : 0;
      System.out.println("Türkçe notunuzu girin : ");
      trk = input.nextInt();
      trk = (trk <= 100 && trk > 0)? trk : 0;
      System.out.println("Müzik notunuzu girin : ");
      mzk = input.nextInt();
      mzk = (mzk <= 100 && mzk > 0)? mzk : 0;
      double avarage = (mat + fiz + kim + trk) / 5;

      if (avarage < 55) {
          System.out.println("Kaldınız");
      }else{
          System.out.println("Geçtiniz");
      }
        System.out.println("Not ortalamanız : " + avarage);

    }
}
