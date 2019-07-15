import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main2 {
    public static void main(String[] args) {
        int num, L, H;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        L = in.nextInt();
        H = in.nextInt();

        Student[] s1 = new Student[num];
        Student[] s2 = new Student[num];
        Student[] s3 = new Student[num];
        Student[] s4 = new Student[num];

        for (int i = 0; i < num; i++) {
            int id, d, c;
            id = in.nextInt();
            d = in.nextInt();
            c = in.nextInt();
            if (d < L || c < L) continue;
            if (d >= H && c >= H) {
                s1[n1] = new Student(id, d, c);
                n1++;
            } else if (d >= H && c <= H) {
                s2[n2] = new Student(id, d, c);
                n2++;
            } else if (d >= c && d <= H && c <= H) {
                s3[n3] = new Student(id, d, c);
                n3++;
            } else {
                s4[n4] = new Student(id, d, c);
                n4++;
            }
        }
        Arrays.sort(s1, 0, n1, new MyComparator());
        sort(s2,0, n2, new MyComparator());
        sort(s3,0, n3, new MyComparator());
        sort(s4, 0, n4,new MyComparator());
        System.out.println(n1 + n2 + n3 + n4);
        for (int i = 0; i < n1; i++) {
            System.out.println(s1[i].id + " " + s1[i].d + " " + s1[i].c);
        }
        for (int i = 0; i < n2; i++) {
            System.out.println(s2[i].id + " " + s2[i].d + " " + s2[i].c);
        }
        for (int i = 0; i < n3; i++) {
            System.out.println(s3[i].id + " " + s3[i].d + " " + s3[i].c);
        }
        for (int i = 0; i < n4; i++) {
            System.out.println(s4[i].id + " " + s4[i].d + " " + s4[i].c);
        }
    }

    static class MyComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.c + o1.d > o2.c + o2.d) return -1;
            if (o1.c + o1.d < o2.c + o2.d) return 1;
            if (o1.c + o1.d == o2.c + o2.d) {
                if (o1.d > o2.d) return -1;
                if (o1.d < 02.d) return 1;
                if (o1.d == o2.d) {
                    if (o1.id > o2.id) return 1;
                    else return -1;
                }
            }
            return 0;
        }
    }

    static class Student {
        int id, d, c;

        Student(int id, int d, int c) {
            this.id = id;
            this.c = c;
            this.d = d;
        }
    }
}
