import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n , r ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ana kümenin eleman sayısını girin");
        n = input.nextInt();
        System.out.println("Oluşturulmak istenen alt kümelerin eleman sayısını girin");
        r = input.nextInt();
        int nfak =1, rfak=1 , nrfak = 1;
        for(int i = 1 ; i < n ; i++){
            nfak = nfak * i;
        }
        for(int i = 1 ; i < (n-r) ; i++){
            nrfak = nrfak * i;
        }
        for(int i = 1 ; i < r ; i++){
            rfak = rfak * i;
        }
        int küm = nfak / (rfak * nrfak);
        System.out.println(n + " elemanlı bir kümede " + r +
                " elemanlı alt kümelerin sayısı : " + küm );
    }
}
