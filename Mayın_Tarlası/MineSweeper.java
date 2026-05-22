import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    char[][] mineDisplay;
    char[][] mineGame;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        create();
        bomb();
    }

    public void create() {
        mineDisplay = new char[this.row][this.col];
        mineGame = new char[this.row][this.col];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                mineDisplay[i][j] = ('-');
                mineGame[i][j] = ('-');
            }
        }
    }

    public void bomb() {
        int mineNum = (row * col) / 4;
        int placed = 0;
        while (placed < mineNum) {
            int randRow = (int) (Math.random() * row);
            int randCol = (int) (Math.random() * col);

            if (mineGame[randRow][randCol] != '*') {
                mineGame[randRow][randCol] = '*';
                placed++;
            }
        }
    }

    public void printDisplayBoard() {
        System.out.println("===========");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mineDisplay[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printGameBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                    System.out.print(mineGame[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void numberFoundandPrint(int rowU, int colU) {
        int count = 0;
        if(mineGame[rowU+1][colU] == '*')
            count++;
        if (mineGame[rowU][colU+1] == '*')
            count++;
        if (mineGame[rowU+1][colU+1] == '*')
            count++;
        if (mineGame[rowU-1][colU-1] == '*')
            count++;
        if (mineGame[rowU-1][colU] == '*')
            count++;
        if (mineGame[rowU][colU-1] == '*')
            count++;

        mineDisplay[rowU][colU] = (char) count;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mineDisplay[i][j] + " ");
            }
        }

    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        int openned = 0;
        while (true){
            printDisplayBoard();
            System.out.println("Tıklamak istediğininiz satırı girin :");
            System.out.print("Satır girin (0-" + (this.row - 1) + "): ");
            int rowU = sc.nextInt();
            System.out.println("Tıklamak istediğiniz kolonu girin :");
            System.out.print("Sütun girin (0-" + (this.col - 1) + "): ");
            int colU = sc.nextInt();
            if (0 > rowU || rowU >= this.row || 0 > colU || colU >= this.col) {
                System.out.println("Geçersiz koordinat. Tekrar deneyin.");
                continue;
            }
            if (mineGame[rowU][colU] == '*') {
                System.out.println("Mayına bastınız Oyun bitti");
                printGameBoard();
                break;
            } else if (mineDisplay[rowU][colU] != '-') {
                System.out.println("Burası açıldı");
                printDisplayBoard();
                continue;
            }else{
                numberFoundandPrint(rowU,colU);
                openned++;
            }
            if (openned == this.row *  this.col) {
                System.out.println("tebrikler kazandınız");
                System.out.println("İşte mayınların yerleri");
                printGameBoard();
            }

        }
    }
}
