    // 268.Missing Number

package Bit_Manipulation;

import java.util.Arrays;

public class MissingNumber {

    // By using Bit Manipulation
    public static int missingNumber1(int[] nums) {
        int missingVal = nums.length;
        
        for(int i=0; i<nums.length; i++) {
            missingVal ^= i ^ nums[i];
        }
        
        return missingVal;
    }

    // By using Sorting
    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(i == nums[i]){
                count++;
            }
        }
        ans += count;
        return ans;
    }

    // By using Math
    public static int missingNumber3(int[] nums) {
        int n = nums.length;
        int ans = n*(n+1)/2;
        for(int i: nums) {
            ans -= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber1(nums) + " is the missing number in the range.");
    }

}
