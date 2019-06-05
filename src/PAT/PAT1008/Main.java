package PAT.PAT1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n];
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        m = m % n;
        for (int i = 0; i < m; i++) {
            System.out.print(a[n - m + i ] + " ");
        }
        for (int i = 0; i < n - m - 1; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print(a[n-m-1]);
    }
}
