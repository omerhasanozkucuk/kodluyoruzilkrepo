import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] v(int[] arr ) {
        int[] sorted = new int[arr.length];
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz :");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dizinin " + (i+1) + ". elemanını giriniz :");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(v(arr)));




    }
}
