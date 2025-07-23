package daily_Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Password {
    static void Checkpassword(int n, int[] arr) {
        int[] freq = new int[101];
        int maxfreq = 0;
        int element = -1;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        boolean res = false;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0 && (freq[i] == 2 || freq[i] % 2 == 0)) {
                res = true;

                if (freq[i] == 2 && element == -1) {
                    element = i;
                } else if (freq[i] > maxfreq) {
                    maxfreq = freq[i];
                    ele = i;
                }
            }

        }
        if (res) {
            System.out.println("valid");
            if (maxfreq > 2) {
                System.out.println(ele);
            } else {
                System.out.println(element);
            }
        } else {
            System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int[] pass = new int[n];
        //
        for (int i = 0; i < n; i++) {
            pass[i] = o.nextInt();
        }
        Checkpassword(n, pass);

    }

}
