giimport java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {12,34,34,31,123,-314};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndxex(arr,0,last);

            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



    static int getMaxIndxex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }

        }
        return max;
    }
}
