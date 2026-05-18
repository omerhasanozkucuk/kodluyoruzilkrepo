public class Main {

    static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {5, 6, 7},
        };
        System.out.println("Martixsin ilk hali :");
        print(matrix);

        int[][] matrix2 = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix2[j][i] = matrix[i][j];
            }
        }
        System.out.println("=================");
        System.out.println("Martixsin transpozu :");
        print(matrix2);

    }
}
