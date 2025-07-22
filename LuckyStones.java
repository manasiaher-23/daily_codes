package daily_Challenges;

import java.util.Scanner;

public class LuckyStones {
    static void CountPairs(int p, int n, int m, int[] stones) {
        int cnt = 0;
        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if ((stones[i] % n == 0 || stones[i] % m == 0) && (stones[j] % n == 0 || stones[j] % m == 0)) {

                    cnt++; // System.out.println();
                }
                System.out.println("[" + stones[i] + "," + stones[j] + "]");
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int p = o.nextInt();
        int[] a = new int[p];
        int n = o.nextInt();
        int m = o.nextInt();
        for (int i = 0; i < p; i++) {
            a[i] = o.nextInt();
        }

        CountPairs(p, n, m, a);
        o.close();
    }

}
