import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz : ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if (heat > 5 && heat < 15) {
            System.out.println("Sinamaya gidebilirsiniz.");
        }else if (heat > 15 && heat < 25) {
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye  gidebilirsiniz.");
        }
    }
}
