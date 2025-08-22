public class CountEvenDigit {
    public static void main(String[] args) {


        int[] nums = {12,3453,34,12222,3432,33211};

        System.out.println(FindNum(nums));
    }
    static int FindNum(int[] nums){
        int count = 0;
        for (int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        return digitCount(num) % 2 ==0;

    };

    static int digitCount(int num){
        int count =0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    };
}
