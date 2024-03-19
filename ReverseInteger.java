
    // 7. Reverse Integer

public class ReverseInteger {
    public static int reverse(int x) {
        long reverseNumber = 0;
        while(x != 0) {
            reverseNumber = (reverseNumber * 10) + x % 10;
            x = x / 10;
            if(reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) {
                return 0;   
            }
        }        
        return (int)reverseNumber;
    }
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }
}
