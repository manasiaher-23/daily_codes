package daily_Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class AllZeroEnd {
    static void AllZero(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[ind] = arr[i];
                ind++;
            }
        }
        while (ind < arr.length) {
            arr[ind] = 0;
            ind++;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int[] arr = new int[n];
        //
        for (int i = 0; i < n; i++) {
            arr[i] = o.nextInt();
        }
        AllZero(arr);
        // System.out.println(res);
        o.close();
    }

}