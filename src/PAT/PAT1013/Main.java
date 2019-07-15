package PAT.PAT1013;

import java.util.Scanner;

public class Main {
    private static int start;
    private static int finish;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        start = in.nextInt();
        finish = in.nextInt();
        int a = 0;
        for (int i = 2; a < finish; i++) {
            if (isPrime(i)) {
                a++;
                if (a >= start) {
                    output(i, a);
                }
            }
        }
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    private static void output(int a, int index) {
        if ((index - start + 1) % 10 == 0) {
            System.out.println(a);
        } else if (index == finish) {
            System.out.print(a);
        } else
            System.out.print(a + " ");
    }
}
