package PAT1003;


import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String[] str = {};
        String[] result = {};
        //输入
        for (int i = 0; i < number; i++) {
            String a = in.nextLine();
            String news = "";

            if (a.contains("P") && a.contains("T") && a.contains("A")) {
                news = a.replaceFirst("P", "");
                news = news.replaceFirst("T", "");
                news = news.replace("A", "");
                if (news.isEmpty()) {
                    int p = news.indexOf("P");
                    int t = news.indexOf("T");
                    int len = news.length();
                    int b = t - p - 1;
                    int c = len - t - 1;
                    if (p * b == c) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }

            } else result[i] = "No";
        }


        //输出
        for (int i = 0; i < number; i++) {
            System.out.println(result[i]);
        }
    }

}
