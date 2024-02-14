package Array;

public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positiveIndex = 0, negativeIndex = 1;       
        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                ans[positiveIndex] = nums[i];
                positiveIndex += 2;
            }else {
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return ans;
    }
    public static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println("Array befor rearranging : ");
        printArray(nums);
        System.out.println("Array after rearranging : ");
        int[] ans = rearrangeArray(nums);
        printArray(ans);
        
    }
}
