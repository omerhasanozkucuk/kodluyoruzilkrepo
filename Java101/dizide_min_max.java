import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin :");
        int n = scanner.nextInt();
        int min2 = min;
        int max2 = max;

        for (int i : list) {
            if (i < n && i > min2) {
                min2 = i;
            }
            if(i > n && i < max2) {
                max2 = i;
            }
        }

        System.out.println("girilen sayıdan küçük ama en büyük :" + min2);
        System.out.println("girilen sayıdan büyük ama en küçük :" + max2);

    }
}
