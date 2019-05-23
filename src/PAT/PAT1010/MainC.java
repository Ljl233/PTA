package PAT.PAT1010;

import java.util.ArrayList;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] newStr = str.split("\\s+");
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < newStr.length; i += 2) {
            int j = i + 1;
            if (Integer.valueOf(newStr[i]) == 0) {
                alist.add(0);
                alist.add(0);
            }
            if (Integer.valueOf(newStr[i]) != 0 && Integer.valueOf(newStr[j]) != 0) {
                alist.add(Integer.valueOf(newStr[i]) * Integer.valueOf(newStr[j]));
                alist.add(Integer.valueOf(newStr[j]) - 1);
            }
        }

        if (alist.isEmpty()) {
            System.out.println("0 0");
        } else {
            for (int i = 0; i < alist.size(); i++) {
                System.out.print(alist.get(i));
                if (i != alist.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}