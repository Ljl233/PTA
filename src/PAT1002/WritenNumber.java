package PAT1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;


public class WritenNumber {

    public static void main(String[] args) {


//        Scanner in = new Scanner(System.in);
//        String number = in.nextLine();
//        int w0 = number.length();
//
//
////提取每一个数字
//        String[] a = new String[w0];
//        for (int i = 0; i < w0; i++) {
//            a[i] = number.substring(i, i + 1);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        try {
            String st = br.readLine();
            char[] chars = st.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                num +=  new Integer(""+chars[i]).intValue();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br!= null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        int n = 0;
//        for (int i = 0; i < w0; i++) {
//            switch (a[i]) {
//                case "0":
//                    n = n + 0;
//                    break;
//                case "1":
//                    n = n + 1;
//                    break;
//                case "2":
//                    n = n + 2;
//                    break;
//                case "3":
//                    n = n + 3;
//                    break;
//                case "4":
//                    n = n + 4;
//                    break;
//                case "5":
//                    n = n + 5;
//                    break;
//                case "6":
//                    n = n + 6;
//                    break;
//                case "7":
//                    n = n + 7;
//                    break;
//                case "8":
//                    n = n + 8;
//                    break;
//                case "9":
//                    n = n + 9;
//                    break;
//                default:
//                    break;
//            }
//
//        }


        //判断n的位数
        int w1 = digit(num);
        //提取n中的每个数
        int b[] = new int[w1];
        for (int c = 0; c < w1; c++) {
            double pow = Math.pow(10, c);
            int w = (int) (num / pow);
            b[c] = w % 10;
        }


        String out = "";
        for (int c = 0; c < w1; c++) {
            switch (b[c]) {
                case 0:
                    out = "ling"+" " + out;
                    break;
                case 1:
                    out = "yi"+" "  + out;
                    break;
                case 2:
                    out = "er"+" "  + out;
                    break;
                case 3:
                    out = "san"+" "  + out;
                    break;
                case 4:
                    out = "si"+" "  + out;
                    break;
                case 5:
                    out = "wu" +" " + out;
                    break;
                case 6:
                    out = "liu"+" "  + out;
                    break;
                case 7:
                    out = "qi"+" "  + out;
                    break;
                case 8:
                    out = "ba" +" " + out;
                    break;
                case 9:
                    out = "jiu"+" "  + out;
                    break;
                default:
                    break;

            }


        }
        System.out.print(out.substring(0,out.length()-1));

    }

    private static int digit(long num) {
        int i = 0;
        while (i < 100) {
            i++;
            double r = Math.pow(10, i);
            if (num < r) break;
        }
        return i;
    }
}
