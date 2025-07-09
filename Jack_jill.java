import java.util.*;

public class Jack_jill {
    static void StringGame(String A, String B) {
        String C = " ";

        char[] ch = A.toCharArray();
        char[] ch2 = B.toCharArray();

        // to remove vowels
        for (int i = 0; i < ch.length; i++) {
            boolean vowelsfound = false;
            for (int j = 0; j < ch2.length; j++) {

                if (ch[i] == ch2[j]) {
                    vowelsfound = true;
                    break;
                } // System.out.print("empty string");

            }
            if (!vowelsfound) {
                C += ch[i];
            }

        }

        System.out.println(C);
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String A = o.nextLine();
        String B = o.nextLine();
        if (A.equals(B)) {
            System.out.println("empty string ");
        } else {
            StringGame(A, B);
        }
        o.close();
    }
}