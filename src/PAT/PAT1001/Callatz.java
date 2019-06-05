package PAT.PAT1001;

import java.util.Scanner;

public class Callatz {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("请输入一个1000以内的数字：");
        int i = in.nextInt();
        while (i != 1) {
            if (i % 2 == 1) {
                a++;
                i = 3 * i + 1;
                i = i / 2;
            } else {
                a++;
                i = i / 2;
            }
        }
        System.out.println("砍了" + a + "下！");
    }
}
