public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Tekrar eden sayılar :");
        int count = 0;
        boolean[] cont = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (cont[i]) continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                    count++;
                    cont[j] = true;
                }
            }
            if(count >= 2)
                System.out.println(arr[i] + " sayısı " + count +" kez tekrar etti");

            count = 0;
        }


    }
}
