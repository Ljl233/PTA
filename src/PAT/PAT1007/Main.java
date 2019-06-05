package PAT.PAT1007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;
//运算超时

public class Main {
    public static void main(String[] args) {

        List<Integer> b = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = i + 1;
        }

        a[0] = 0;
        for (int i = 1; i < num; i++) {
            for (int j = 2; j < sqrt(i) + 1; j++) {
                if (a[i] % j == 0) {
                    a[i] = 0;
                }
            }
            if (a[i] != 0) {
                b.add(a[i]);
            }
        }
        int size = b.size();

        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            if (b.get(i + 1) - b.get(i) == 2) {
                temp++;
            }
        }
        System.out.print(temp);


    }


}
