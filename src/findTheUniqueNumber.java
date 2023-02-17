//There is an array with some numbers.
// All numbers are equal except for one. Try to find it!

import java.util.Arrays;

public class findTheUniqueNumber {

    public static void main(String[] args) {

        double[] numbers= { 0, 0, 0.55, 0, 0 };
        System.out.println(Kata.findUniq(numbers));
    }
}
class Kata {
    public static double findUniq(double[] arr) {
        // Do the magic
        Arrays.sort(arr);
        if(arr[0]==arr[1])
            return arr[arr.length-1];
        else
            return arr[0];
            }
}
