package PAT.PAT1012;

import java.util.Scanner;

/**
 * 1012 数字分类 (20 分)
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
 * <p>
 * A
 * ​1
 * ​​  = 能被 5 整除的数字中所有偶数的和；
 * A
 * ​2
 * ​​  = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n
 * ​1
 * ​​ −n
 * ​2
 * ​​ +n
 * ​3
 * ​​ −n
 * ​4
 * ​​ ⋯；
 * A
 * ​3
 * ​​  = 被 5 除后余 2 的数字的个数；
 * A
 * ​4
 * ​​  = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
 * A
 * ​5
 * ​​  = 被 5 除后余 4 的数字中最大数字。
 * 输入格式：
 * 每个输入包含 1 个测试用例。每个测试用例先给出一个不超过 1000 的正整数 N，随后给出 N 个不超过 1000 的待分类的正整数。数字间以空格分隔。
 * <p>
 * 输出格式：
 * 对给定的 N 个正整数，按题目要求计算 A
 * ​1
 * ​​ ~A
 * ​5
 * ​​  并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * <p>
 * 若其中某一类数字不存在，则在相应位置输出 N。
 * <p>
 * 输入样例 1：
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 输出样例 1：
 * 30 11 2 9.7 9
 * 输入样例 2：
 * 8 1 2 4 5 6 7 9 16
 * 输出样例 2：
 * N 11 2 N 9
 * 作者: CHEN, Yue
 * 单位: 浙江大学
 * 时间限制: 400 ms
 * 内存限制: 64 MB
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();
        }
        classify1(a);
        classify2(a);
        classify3(a);
        classify4(a);
        classify5(a);
    }

    private static void classify5(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i] && a[i] % 5 == 4) {
                int tem = a[i];
                a[i] = max;
                max = tem;
            }
        }
        if (max == 0) {
            System.out.print("N");
        } else System.out.print(max);
    }

    private static void classify4(int[] a) {
        float n = 0;
        float r = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 3) {
                n = n + 1;
                r += a[i];
            }
        }

        if (n == 0) System.out.print("N ");
        else {
            r = r / n;
            System.out.print(String.format("%.1f", r) + " ");
        }
    }

    private static void classify1(int[] a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                r = r + a[i];
            }
        }
        if (r == 0) {
            System.out.print("N ");
        } else System.out.print(r + " ");
    }

    private static void classify2(int[] a) {
        int p = -1, r = 0, b = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 1) {
                b++;
                p = p * (-1);
                r = r + p * a[i];
            }
        }
        if (b != 0) {
            System.out.print(r + " ");
        } else System.out.print("N ");
    }

    private static void classify3(int[] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 2) {
                n++;
            }
        }
        if (n == 0) System.out.print("N ");
        else System.out.print(n + " ");
    }

}
