package daily_Challenges;

import java.util.*;

public class Nth_largest {

    static void NthLarge(int[] arr, int N) {
        System.out.println("Sorting array in desending order:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Nth largest:");
       
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[N]) {
                cnt += 1;
                if (cnt == N) {
                    System.out.println(arr[N]);
                    break;
                }
            }

        }
       
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int size = o.nextInt();
        int[] a = new int[size];
        System.out.println("Array elemnts: ");
        for (int i = 0; i < size; i++) {
            a[i] = o.nextInt();
        }
        System.out.print("Enter N : ");
        int N = o.nextInt();
        NthLarge(a, N);
        o.close();
    }

}
