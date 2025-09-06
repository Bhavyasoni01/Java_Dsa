public class SearchInRange {
    public static void main(String[] args) {


        int[] newarray = {12,3,4456,7,6,34,4};
         boolean ans  = RangeSearch(newarray,7,1,2);

        System.out.println(ans);
    }
    static boolean RangeSearch(int[] arr,int target, int start, int end){
        if(arr.length == 0){
            return false;
        }

        for (int i = start; i < end; i++) {
            if(arr[i]==target) {
                return true;
            }
        }
        return false;
    }
}
