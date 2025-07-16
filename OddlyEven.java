package daily_Challenges;

import java.util.Scanner;

public class OddlyEven {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String n = o.nextLine();// take string then tochararray for indexing
        char[] c = n.toCharArray();
        int Evensum = 0;
        int Oddsum = 0;
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                Evensum += c[i];
            } else if (i % 2 != 0) {
                Oddsum += c[i];
            }

        }
        System.out.println(Oddsum - Evensum);

        o.close();

    }

}
