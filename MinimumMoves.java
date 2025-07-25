package daily_Challenges;

import java.util.*;

public class MinimumMoves {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int[] seat = new int[n];
        int[] stud = new int[n];
        for (int i = 0; i < n; i++) {
            seat[i] = o.nextInt();
        }
        for (int i = 0; i < n; i++) {
            stud[i] = o.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (seat[i] < stud[j]) {

                }

            }
            cnt++;
            // System.out.println(tnt);
        }

        o.close();
        System.out.println(cnt + " cnt");

    }

}
