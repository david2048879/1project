import java.util.Arrays;

public class array {
    public static void main(String[] args) {
       int [] myArray={20,10,50,30};
        System.out.println(" the array before sorted = " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(" the array after sorted = " + Arrays.toString(myArray));
    }
}
