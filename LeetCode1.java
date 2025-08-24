// https://leetcode.com/problems/contains-duplicate
import java.util.Arrays;
public class LeetCode1 {
   public static boolean  main(String[] args) {

    int[] nums = {1,2,3,1};
    Arrays.sort(nums);

    boolean ans = false;

    for (int i = 1; i < nums.length; i++) {
        if(nums[i]==nums[i-1]){
         ans =   true;
        }
        else{
            ans = false;
        }
    }

    return ans;

   }
}

