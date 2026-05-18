import java.util.Scanner;

public class main {

    static boolean isTrue (int number){
        int temp = number;
        int reverse = 0;
        int lastN;

        while (temp != 0) {
            lastN = temp % 10;
            reverse = reverse * 10 + lastN;
            temp = temp / 10;

        }
        if (reverse == number)
            return true;
        else
        return false;
    }
    public static void main(String[] args) {

        System.out.println(isTrue (11));
    }
}
