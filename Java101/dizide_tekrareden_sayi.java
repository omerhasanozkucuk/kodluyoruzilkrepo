import java.util.ArrayList;

public class Main {

    static boolean isFınd(int[]arr,int value){
        for(int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = new int[]{2, 2, 3, 3, 6, 6, 7, 8, 7, 10};
        int[] duplicate = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if((i != j) && (list[i] == list[j]) && (list[j] % 2 == 0)) {
                    if(!isFınd(duplicate, list[j])) {
                        duplicate[index++] = list[j];
                    }
                    break;
                }
            }
        }
        for(int i : duplicate){
            if(i != 0)
            System.out.println(i);
        }
    }
}
