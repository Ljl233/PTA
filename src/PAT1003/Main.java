package PAT1003;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String[] str = {};
        String[] result = new String[number];

        int d1, d2, len, p1, p2, p3;
        //输入
        for (int i = 0; i < number; i++) {
            String a = in.nextLine();
            String news ;


            if (a.contains("P") && a.contains("T") && a.contains("A")) {
                news = a.replaceFirst("P", "");
                news = news.replaceFirst("T", "");
                news = news.replace("A", "");

                if (news.isEmpty()) {
                    d1 = a.indexOf("P");
                    d2 = a.indexOf("T");
                    len = a.length();
                    p1 = d1 - 1;
                    p2 = d2 - d1 - 1;
                    p3 = len - d2;
                    if (p3 == p1 * p2) {
                        result[i] = "Yes";
                    } else {
                        result[i] = "No";
                    }

                } else {
                    result[i] = "No";
                }
            } else {
                result[i] = "No";
            }
        }


        //输出
        for (int i = 0; i < number-1; i++) {
            System.out.println(result[i]);
        }
    }
}
