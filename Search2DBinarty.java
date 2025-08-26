import java.util.Arrays;

public class Search2DBinarty {
    public static void main(String[] args) {
    int[][] array={
            {12,13,14,55},
            {22,33,44,66},
            {33,44,55,88},
    };
        System.out.println(Arrays.toString(BinearySearch2D(array,1221)));
    }

    static int[] BinearySearch2D(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length -1 ;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }}
