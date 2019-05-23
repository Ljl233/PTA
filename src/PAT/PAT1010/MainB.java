package PAT.PAT1010;

import java.util.ArrayList;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split("\\s+");
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < strings.length; i += 2) {

            if (Integer.valueOf(strings[i]) != 0 && Integer.valueOf(strings[i + 1]) != 0) {
                num.add(Integer.valueOf(strings[i]) * Integer.valueOf(strings[i + 1]));
                num.add(Integer.valueOf(strings[i + 1]) - 1);

            }
//            if (Integer.valueOf(strings[i + 1]) == 0 && Integer.valueOf(strings[i]) != 0) {
//                num.add(0);
//                num.add(0);
//            }
        }
        if (num.isEmpty()) {
            System.out.print("0 0");
        } else {
            for (int i = 0; i < num.size(); i++) {
                System.out.print(num.get(i));
                if (i != num.size() - 1) {
                    System.out.print(" ");
                }
            }

        }
    }
}
