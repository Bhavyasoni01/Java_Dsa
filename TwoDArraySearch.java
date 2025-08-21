import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,34,55},
                {12,12,34,54},
                {99,100},
                {342,32}
        };
        int target = 100;

        int[] ans = Search2D(arr,54);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search2D(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
     return new int[]{-1,-1};
    }


}
