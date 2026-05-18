import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14 , alan , çevre, r;
        System.out.println("Dairenin yarı çapını girin : ");
        r = input.nextDouble();
        alan = r*r*pi;
        çevre = 2*r*pi;
        System.out.println("Diarenin çevresi : " + çevre);
        System.out.println("Dairenin alanı : " + alan);
        double mainAngle , sliceArea;
        System.out.println("Daire diliminin açısını girin : ");
        mainAngle = input.nextDouble();
        sliceArea = (alan*mainAngle) / 360.00;
        System.out.println("Slice area : " + sliceArea);




    }
}
