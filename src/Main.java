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
//        //2  //3
        int[] a = {1,2,0,4};
        int j = a[0];
        int oss = a[0];
        int binar = 0;
        int binarmax = 0;
        for (int i = 0; i < a.length; i++) {
            j = Math.min(a[i],j);
            oss = Math.max(a[i], oss);


        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == j)
            {
                binar = i;
            }
            else if(a[i] == oss){
                binarmax = i;
            }
        }
        System.out.println(j + "min");
        System.out.println(oss + "max");
        System.out.println(binar);
        System.out.println(binarmax);


        //4

//        int e = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0){
//                e++;
//            }
//        }
//        System.out.println("Нулевых значений = " + e);

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

//        String s = Arrays.toString(a).replace(",", "");
//        s = s.replace(" ", "");
//        s = s.replace("[", "");
//        s = s.replace("]", "");
//        int ci = Integer.parseInt(s);
//        ci = ci + 1;
//
//        String n = Integer.toString(ci);
//        char[] ch = n.toCharArray();
//
//        int[] intArray = new int[ch.length];
//        for (int i = 0; i < ch.length; i++) {
//            intArray[i] = Character.getNumericValue(ch[i]);
//        }
//        System.out.println(Arrays.toString(intArray));




    }
}