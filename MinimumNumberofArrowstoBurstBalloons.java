
        // 452. Minimum Number of Arrows to Burst Balloons
import java.util.Scanner;
public class MinimumNumberofArrowstoBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        int ans = 0;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for(int i=0; i<n; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println(findMinArrowShots(points));
    }
}
