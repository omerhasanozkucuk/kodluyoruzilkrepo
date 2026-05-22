import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.println("Mayın tarlasına hoş geldiniz");
        boolean controller = true;
        do {
            System.out.println("Lütfen satır sayısını giriniz :");
            row = input.nextInt();

            System.out.println("===============");
            System.out.println("Lütfen sütün sayısını giriniz");
            col = input.nextInt();
            System.out.println("===============");
            if(row<2 || col<2){
                System.out.println("Hatalı boyut girdiniz");
            } else{
                controller = false;
            }
        }
        while (controller);

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();


    }
}
