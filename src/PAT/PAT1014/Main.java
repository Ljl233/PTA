package PAT.PAT1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//要点：小时和分钟补0

        //1.weekday  2.hour  3.minutes
        String a1, a2, b1, b2;
        char a, b;
        String week = null;
        int indexWeek = -1, nweek = 0;
        int hour = -1, minutes = 0;
        Scanner in = new Scanner(System.in);
        a1 = in.next();
        a2 = in.next();
        b1 = in.next();
        b2 = in.next();


        for (int i = 0; i < a1.length() && i < a2.length(); i++) {
            a = a1.charAt(i);
            b = a2.charAt(i);
            if (indexWeek < 0 && a == b && a >= 65 && a <= 71) {//第一个相同的大写字母确定星期
                indexWeek = i;//--->星期几
                nweek = a - 64;
            } else if (indexWeek >= 0 && a == b && ((a >= 48 && a <= 57) || (a >= 65 && a <= 78))) {  //下一个相同的字符   0-9（48-57）  A-N（65-78）
                if (a <= 57) {
                    hour = a - 48;//数字
                } else {
                    hour = a - 55;//字母
                }
                break;
            }
        }
        for (int i = 0; i < b1.length() && i < b2.length(); i++) {//找到相同字符的索引，从 0 开始
            a = b1.charAt(i);
            b = b2.charAt(i);
            if (a == b && ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))) {//大写字母65-90 小写字母97-122
                minutes = i;
                break;
            }
        }
        switch (nweek) {
            case 1:
                week = "MON";
                break;
            case 2:
                week = "TUE";
                break;
            case 3:
                week = "WED";
                break;
            case 4:
                week = "THU";
                break;
            case 5:
                week = "FRI";
                break;
            case 6:
                week = "SAT";
                break;
            case 7:
                week = "SUN";
                break;
            default:
                break;
        }
        System.out.print(week + " ");
        System.out.printf("%02d:", hour);
        System.out.printf("%02d\n", minutes);
//考虑等于10 的时候
        if (minutes < 10 && hour < 10) {
            System.out.print(week + " " + "0" + hour + ":" + "0" + minutes);
        } else if (minutes >= 10 && hour < 10) {
            System.out.print(week + " " + "0" + hour + ":" + minutes);
        } else if (minutes < 10 && hour >= 10) {
            System.out.print(week + " " + hour + ":" + "0" + minutes);
        } else System.out.print(week + " " + hour + ":" + minutes);

//        System.out.print(week + " ");
//        if (hour < 10) System.out.print("0");
//        System.out.print(hour+":");
//        if (minutes < 10) System.out.print("0");
//        System.out.print(minutes);
    }


}
