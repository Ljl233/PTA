package PAT.PAT1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] num = in.nextLine().split("\\s+");
        int n = num.length;

        int[] coefficient = new int[n / 2];
        int[] index = new int[n / 2];
        int[] coefficient2 = new int[n / 2];
        int[] index2 = new int[n / 2];

        for (int i = 0; i < n; i += 2) {
            coefficient[i / 2] = Integer.parseInt(num[i]);
            index[i / 2] = Integer.parseInt(num[i + 1]);
        }

        for (int i = 0; i < n / 2; i++) {
            coefficient2[i] = coefficient[i] * index[i];
            index2[i] = index[i] - 1;
        }


        if (coefficient2[0] == 0) {
            System.out.print("0 0");
        } else {
            for (int i = 0; i < n / 2; i++) {
                if (coefficient2[i] != 0 && index2[i] > 0 && i != n / 2 - 1) {
                    System.out.print(coefficient2[i] + " " + index2[i] + " ");

                } else if ((coefficient2[i] != 0 && index2[i] == 0) || (i == n / 2 - 1 && index2[i] > 0)) {
                    System.out.print(coefficient2[i] + " " + index2[i]);

                }
            }
        }

    }
}
