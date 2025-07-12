package daily_Challenges;

import java.util.*;

public class Alice_reward {
    static int Max_points(int[] a) {
        int[] dp = new int[a.length];
        int max = 1;
        for (int i = 0; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the Number of levels: ");
        int n = o.nextInt();
        int[] ar = new int[n];
        // inp
        System.out.print("enter levels  space separetd elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = o.nextInt();
        }

        System.out.println("Max reward point is:" + Max_points(ar));
        o.close();
    }

}
