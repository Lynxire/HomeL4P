import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int write = scanner.nextInt();

        int[] a = new int[write];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)((Math.random() * 100));
        }

       // 1
        for (int i = 0; i <= a.length; i++) {
            System.out.println(i);
        }
        for (int i = a.length; i >= 0 ; i--) {
            System.out.println(i);
        }

        //2
        int j = a[0];
        for (int i = 0; i < a.length; i++) {
            j = a[i];


        }
        System.out.println(Math.min(a[0], j));
        System.out.println(Math.max(a[0], j));

          //3
          int o = Math.max(a[0],j);
        int o1 = Math.min(a[0],j);
        System.out.println(Arrays.binarySearch(a, o));
        System.out.println(Arrays.binarySearch(a, o1));

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
//            // Input array
//            System.out.println("Input Array :" + Arrays.toString(a));
//
//            // Declaring variables for array reversal
//            int n = a.length;
//            int[] temp = new int[n];
//
//            // Reversal of array using Temporary variable
//            for(int i = n - 1; i > -1; i--) {
//                // Storing the elements of the input array in reverse order
//                temp[n - i - 1] = a[i];
//            }
//
//            // Output
//            System.out.println("Reversed Array :" + Arrays.toString(temp));

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




    }
}