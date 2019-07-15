package PAT.PAT1015;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int H;
    private static int L;

    public static void main(String[] args) {
        int num;
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Student> a2 = new ArrayList<>();
        ArrayList<Student> a3 = new ArrayList<>();
        ArrayList<Student> a4 = new ArrayList<>();

        ArrayList<Student> students = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        L = in.nextInt();
        H = in.nextInt();

        for (int i = 0; i < num; i++) {
            int id = in.nextInt();
            int dg = in.nextInt();
            int cg = in.nextInt();
            Student student;
            if (dg >= L && cg >= L) {
                student = new Student(id, dg, cg);

                switch (student.getType()) {
                    case 1:
                        a1.add(student);
                        break;
                    case 2:
                        a2.add(student);
                        break;
                    case 3:
                        a3.add(student);
                        break;
                    case 4:
                        a4.add(student);
                        break;
                    default:
                        break;
                }
            }

        }
        sortBySum(a1);
        sortBySum(a2);
        sortBySum(a3);
        sortBySum(a4);
        students.addAll(a1);
        students.addAll(a2);
        students.addAll(a3);
        students.addAll(a4);
        num = students.size();
   //students = sortByType(students);
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            System.out.println(students.get(i).id + " " + students.get(i).dg + " " + students.get(i).cg+" "+students.get(i).getType());
        }
    }

    private static ArrayList<Student> sortByType(ArrayList<Student> students) {
        ArrayList<Student> a = new ArrayList<>();
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Student> a2 = new ArrayList<>();
        ArrayList<Student> a3 = new ArrayList<>();
        ArrayList<Student> a4 = new ArrayList<>();
        for (Student student : students) {
            switch (student.getType()) {
                case 1:
                    a1.add(student);
                    break;
                case 2:
                    a2.add(student);
                    break;
                case 3:
                    a3.add(student);
                    break;
                case 4:
                    a4.add(student);
                    break;
                default:
                    break;
            }
        }
        sortBySum(a1);
        sortBySum(a2);
        sortBySum(a3);
        sortBySum(a4);
        a.addAll(a1);
        a.addAll(a2);
        a.addAll(a3);
        a.addAll(a4);
        return a;
    }

    private static void sortBySum(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i; j < students.size(); j++) {
                if (students.get(i).getSum() < students.get(j).getSum()) {
                    Student si = students.get(i);
                    Student sj = students.get(j);
                    students.set(i, sj);
                    students.set(j, si);
                }
            }
        }
    }

    static class Student {
        int id, dg, cg, sum, type;

        Student(int id, int dg, int cg) {
            this.id = id;
            this.dg = dg;
            this.cg = cg;
        }

        int getSum() {
            return cg + dg;
        }

        int getType() {
            if (cg >= H && dg >= H) {
                type = 1;
            } else if (dg >= H && cg <= H && cg >= L) {
                type = 2;
            } else if (dg >= cg && dg <= H && cg >= L) {
                type = 3;
            } else if (dg <= L && cg <= L) {
                type = 5;
            } else type = 4;
            return type;
        }
    }
}
