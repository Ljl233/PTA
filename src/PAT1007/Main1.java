package PAT1007;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int tem=0;
        for (int i =2;i<num-2;i++){
            if (isPrime(i)&&isPrime(i+2)){
                tem++;
            }
        }
        System.out.print(tem);

    }

    private static boolean isPrime(int a) {
        for (int i = 2; i < sqrt(a) + 1; i++) {
            if (a % i == 0) {
                return false;
            }

        }
        return true;
    }


}
