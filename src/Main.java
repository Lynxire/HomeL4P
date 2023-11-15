import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int write = scanner.nextInt();
//
//        int[] a = new int[write];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (int)((Math.random() * 100));
//            System.out.println(a[i]);
//        }

//       // 1
//        int mass = a[0];
//        for (int i = 0; i <= a.length; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = a.length; i >= 0 ; i--) {
//            System.out.println(i);
//        }
//
//        //2
//        int j = a[0];
//        for (int i = 0; i < a.length; i++) {
//            j = a[i];
//
//
//        }
//        System.out.println(Math.min(a[0], j));
//        System.out.println(Math.max(a[0], j));
//
//          //3
//          int o = Math.max(a[0],j);
//        int o1 = Math.min(a[0],j);
//        System.out.println(Arrays.binarySearch(a, o));
//        System.out.println(Arrays.binarySearch(a, o1));

        //4
//
//        int i = 0;
//        while (i<a.length){
//            int j = a[0];
//            i++;
//            j = a[i];
//            int e = 0;
//            if(j == 0){
//                e++;
//                System.out.println(e);
//            }
//            else
//            {
//                System.out.println("none");
//            }
//        }
        // 5
//       int j = a.length;
//        while (j > 0){
//            j--;
//            System.out.print(a[j]);
//        }

        //6

//        boolean cc = false;
//        for (int i = 0; i < a.length - 1; i++)
//        {
//            if (a[i] < a[i + 1]){
//
//                cc = true;
//            }
//
//            else
//            {
//                cc = false;
//                break;
//            }
//
//        }
//        System.out.println(cc);
        //7
        int[] a = {9,9,9};
        String s = Arrays.toString(a).replace(",", "");
        s = s.replace(" ", "");
        s = s.replace("[", "");
        s = s.replace("]", "");
        int ci = Integer.parseInt(s);
        ci = ci + 1;

        String n = Integer.toString(ci);
        char[] ch = n.toCharArray();

        int[] intArray = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            intArray[i] = Character.getNumericValue(ch[i]);
        }
        System.out.println(Arrays.toString(intArray));




    }
}