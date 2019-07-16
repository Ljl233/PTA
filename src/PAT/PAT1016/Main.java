package PAT.PAT1016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String da = in.next();
        String b = in.next();
        String db = in.next();

        String x = "";
        String y = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).equals(da))
                x = x + da;
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.substring(i, i + 1).equals(db))
                y = y + db;
        }
        int ai, bi;
        if (x.equals("")) ai = 0;
        else ai = Integer.valueOf(x);
        if (y.equals("")) bi = 0;
        else bi = Integer.valueOf(y);

        int sum = ai + bi;
        System.out.println(sum);
    }
}
