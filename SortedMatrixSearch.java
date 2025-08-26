public class SortedMatrixSearch {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] matrix,int row, int Cstart, int Cend, int target){
        while(Cstart<=Cend){
            int mid = Cstart + (Cend - Cstart) /2;
                if(matrix[row][mid] == target){
                    return new int[]{row,mid};
                }
                if(matrix[row][mid]<target){
                    Cstart = mid + 1;
                }
                else{
                    Cend = mid -1;
                }
            }
            return new int[] {-1,-1};
        }
    }

