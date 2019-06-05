package PAT.PAT1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, max, min;
        String[] strings, grades;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        strings = new String[num];
        grades = new String[num];
        for (int i = 0; i < num; i++) {
            Scanner in2 = new Scanner(System.in);
            strings[i] = in2.nextLine();
            //lastIndexOf返回匹配的最后一个的开始位置，从末尾开始计算
            int a = strings[i].lastIndexOf(" ");
            //substring 创建一个新字符从。。。开始
            grades[i] = strings[i].substring(a + 1);

        }
        max = Integer.parseInt(grades[0]);
        min = Integer.parseInt(grades[0]);
        for (int i = 1; i < num; i++) {
            if (Integer.parseInt(grades[i]) > max) {
                max = Integer.parseInt(grades[i]);
            }
            if (Integer.parseInt(grades[i]) < min) {
                min = Integer.parseInt(grades[i]);
            }
        }
        if (min == max) {
            for (int i = 0; i < num; i++) {
                if (Integer.parseInt(grades[i]) == min) {
                    System.out.println(strings[i].substring(0,strings[i].lastIndexOf(" ")));
                }
            }
        } else {
            for (int i = 0; i < num; i++) {
                if (Integer.parseInt(grades[i]) == max) {
                    System.out.println(strings[i].substring(0,strings[i].lastIndexOf(" ")));
                }
            }
            for (int i = 0; i < num; i++) {
                if (Integer.parseInt(grades[i]) == min) {
                    System.out.println(strings[i].substring(0,strings[i].lastIndexOf(" ")));
                }
            }

        }
    }

}
