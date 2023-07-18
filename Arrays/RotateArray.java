
//	189. Rotate Array

import java.util.Scanner;
public class RotateArray {
    private static void reverse(int[] arr,int i, int j){
		while(i < j){
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}
	static void rotate(int[] arr, int k){
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
	}
	static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements :");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter K: ");
		int k = sc.nextInt();
		System.out.println("Original array: ");
		printArray(arr);
		rotate(arr, k);
		System.out.println( );
		System.out.println("Array after rotation:");
		printArray(arr);	
	}
}