package daily_Challenges;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int r1 = o.nextInt();
        int N = o.nextInt();
        int r2 = o.nextInt();
        int X = o.nextInt();
        int Totalhrs = (X + 59) / 60;
        System.out.println(Totalhrs);
        Totalhrs -= N;
        int total_cost = (r1 * N + Totalhrs * r2);
        System.out.println(total_cost);
    }

}
