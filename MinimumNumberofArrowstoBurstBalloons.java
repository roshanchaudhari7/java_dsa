
        // 452. Minimum Number of Arrows to Burst Balloons
import java.util.Arrays;
import java.util.Scanner;
public class MinimumNumberofArrowstoBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1, arrowsPosition = points[0][1];
        for(int i = 0; i < points.length; i++){
            if(points[i][0] <= arrowsPosition){
                continue;
                
            }
            arrows++;
            arrowsPosition = points[i][1];
        }
        return arrows;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for(int i=0; i<n; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println("The balloons can be burst by " + findMinArrowShots(points) + " arrows.");
        sc.close();
    }
}
