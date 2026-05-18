public class main {
    public static void main(String[] args) {
        int count = 0;

        for(int s = 1 ; s<=100; s++){
            for(int j = 1 ; j <=100 ; j++){
                if (s%j==0){
                    count++;
                }
            }
            if(count==2) {
                System.out.println("asal sayidir : " + s);
            }
            count = 0 ;

        }
    }
}
