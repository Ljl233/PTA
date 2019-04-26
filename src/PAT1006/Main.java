package PAT1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int[] a = new int[3];
        String string="";
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for (int i = 0; i < 3; i++) {
            a[i] = num % 10;
            num = num / 10;
        }
        for (int i=0;i<a[2];i++){
            string=string+"B";
        }
        for(int i=0;i<a[1];i++){
            string=string+"S";
        }
        for(int i=1;i<a[0]+1;i++){
            string=string+i;
        }
        System.out.println(string);

    }


}
