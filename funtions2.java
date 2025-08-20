import java.util.Arrays;

public class funtions2 {
    public static void main(String[] args) {
        int []arr = {1,24,4324};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] num) {
        num[0] = 129;
    }

}
