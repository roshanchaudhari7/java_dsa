
//	977. Squares of a Sorted Array

import java.util.Scanner;
public class SquaresOfSortedArray {
    static int[] sortedSquares(int[] arr) {
		int n = arr.length;
        int left = 0;
        int right = arr.length-1;
        int[] ans = new int[n];
        int k = n-1;
        while(left <= right){
        	if(Math.abs(arr[left]) > Math.abs(arr[right])){
        		ans[k--] = arr[left] * arr[left];
        		left++;
        	}else{
        		ans[k--] = arr[right] * arr[right];
        		right--;
        	}
        }
        return ans;
    }
	static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements :");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original array: ");
		printArray(arr);
		int[] ans = sortedSquares(arr);
		System.out.println( );
		System.out.println("After squaring: ");
		printArray(ans);
		sc.close();
	}
}
