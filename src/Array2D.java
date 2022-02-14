import java.util.Arrays;

public class Array2D {


    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}};
        for (int i = 0; i <4; i++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(array[i][x] +" ");
            }
            System.out.println();
        }
    }
}
