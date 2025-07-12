package daily_Challenges;

import java.util.Scanner;

public class same_withDigit {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        int m = o.nextInt();
        int n = o.nextInt();

        for (int i = m; i <= n; i++) {
            // String str = Integer.toString(i);

            String formated = String.format("%03d", i);
            System.out.println(formated);
        }

        o.close();
    }
}