import java.util.Arrays;
import java.util.Scanner;

public class input_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[2];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int num : arr) { // for every element in array, print the array
//            System.out.println(num + ""); //here num represents element of array
//        }

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
