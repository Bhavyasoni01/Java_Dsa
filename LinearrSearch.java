public class LinearrSearch {
    public static void main(String[] args) {
        int[] array = {12,34,65,465,76,};

        int target = 12;

       int ans = linearSearch(array,122);

        System.out.println(ans);


    }

    static int linearSearch(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("Element Found at " + i);
                break;
            }
        }

         return -1;

    }
}
