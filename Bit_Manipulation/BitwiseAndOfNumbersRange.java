
    // 201.Bitwise AND of Numbers Range
package Bit_Manipulation;

public class BitwiseAndOfNumbersRange {
    public static int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right = right & right-1;
        }
        return right;
    }
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left, right));
    }
}
