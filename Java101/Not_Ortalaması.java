mport java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int mat , fizik , kim , turkce , tarih , muzik;

        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunuz: ");
        kim = scan.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = scan.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = scan.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = scan.nextInt();

        int sum = (mat + fizik + kim + turkce + tarih + muzik);
        double avr = sum / 6.00;

        if (avr >= 60.00) {
            System.out.println("Sınıfı geçtiniz" + avr);
        }else {
            System.out.println("Sınıfta kaldınız" + avr);
        }

    }
}
