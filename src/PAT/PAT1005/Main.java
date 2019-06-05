package PAT.PAT1005;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        int num = Integer.parseInt(in.nextLine());//强制类型转换,含空格报错

        HashSet<Integer> hashSet = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        int a[] = new int[num];
//依次输入
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();//可以数字中间空格连接
        }
        for (int i = 0; i < num; i++) {
            int k = a[i];//中间变量
            while (k != 1) {
                if (k % 2 == 1) {
                    k = (3 * k + 1) / 2;
                } else {
                    k = k / 2;
                }
                hashSet.add(k);
            }
        }
        for (int i = 0 ;i<num;i++){
            if (!hashSet.contains(a[i])){
                list.add(a[i]);
            }
        }
        Collections.sort(list);//对list进行排序

        if (list.size()==1){
            System.out.print(list.get(0));
        }else{
            for(int i =list.size();i>0;i--){
                System.out.print(list.get(i-1));
                if(i!=1){
                    System.out.print(" ");
                }
            }
        }



//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        int k;
//
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();//可以数字中间空格连接
//        }
////排序
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (a[i] < a[j]) {
//                    k = a[i];
//                    a[i] = a[j];
//                    a[j] = k;
//                }
//            }
//        }
//
//        //依次打印每一个数，检查
//        for (int i = 0; i < n; i++) {
//
//            System.out.print(a[i]);
//        }
//        System.out.println("");//换行
//
//        for (int i = 0; i < n; i++) {
//
//
//            k = a[i];
//            while (k != 1) {
//                if (k % 2 == 0) {
//                    k = k / 2;
//                } else {
//                    k = (3 * k + 1) / 2;
//                }
//
//                for (int j = 0; j < n; j++) {
////                    if (i == j) {
////                        continue;
////                    }
//
//                    if (a[j] == k) {
//                        a[j] = 0;
//                    }
//
//                }
//
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i] != 0) {
//                if (i == 0) {
//                    System.out.print(a[i]);
//                } else {
//                    System.out.print(" " + a[i]);
//                }
//
//            }
//        }

    }
}
