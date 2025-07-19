package daily_Challenges;

import java.util.*;

public class MagicFunction {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String n = o.nextLine();
        // char []ch=n.toCharArray();
        int num = o.nextInt();
        for (int i = 0; i < n.length(); i++) {
            int n1 = n.charAt(i) - '0';
            int res = (n1 + num) % 10;
            System.out.print(res);
        }
        o.close();

    }
}