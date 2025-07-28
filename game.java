package daily_Challenges;

public class game {
    public static void main(String[] args) {
        int n = 24516;
        String s = Integer.toString(n);
        int[] dig = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            dig[i] = s.charAt(i) - '0';

        }

        for (int i = 0; i < dig.length; i++) {
            dig[i] = Math.abs(dig[i] - 9);
            System.out.print(dig[i]);
        }

    }

}
