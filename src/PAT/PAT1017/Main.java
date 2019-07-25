package PAT.PAT1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //   Scanner in = new Scanner(System.in);
        String[] ab = null;
        try {
            ab = bufferedReader.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int dividend = Integer.parseInt(ab[1]);//被除数
        String a = ab[0];
        int length = ab[0].length();//长度

        int result = 0;//结果
        int remainder = 0;

        result = (a.charAt(0) - '0') / dividend;
        if ((result != 0 && length > 1) || length == 1) System.out.print(result);
        remainder = (a.charAt(0) - '0') % dividend;


        for (int i = 1; i < length; i++) {
            result = (remainder * 10 + a.charAt(i) - '0') / dividend;
            System.out.print(result);
            remainder = (remainder * 10 + a.charAt(i) - '0') % dividend;

        }
        System.out.print(" " + remainder);
    }
}
