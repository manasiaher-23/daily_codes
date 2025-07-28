package daily_Challenges;

import java.util.Scanner;

public class rearrangingMultiples {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = o.nextInt();
        }

        System.out.println("Rearranging");
        for (int i = 0; i < n; i++) {
            if (a[i] % 10 != 0) {
                System.out.print(a[i] + " ");
            }

        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 10 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        o.close();
    }
}