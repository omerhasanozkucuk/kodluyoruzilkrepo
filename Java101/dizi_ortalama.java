public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        System.out.println("Artitmetik ortalama : " + average);

        double sum2 = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum2 += 1.0/numbers[i];
        }
        double average2 =   numbers.length / sum2;
        System.out.println("Harmonik  ortalama : " + average2);
    }

}
