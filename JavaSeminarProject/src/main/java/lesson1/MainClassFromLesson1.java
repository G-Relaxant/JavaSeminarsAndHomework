/*
package lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClassFromLesson1 {
    public static void main(String[] args) {
//        exOne();
//        exTwo();
//        ex3();
//        ex4();
//        ex5();
        int rslt = getRandomArrMaxCount(100);
        System.out.print("Result = ");
        System.out.println(rslt);
    }

    private static void exOne() {
        System.out.println("Hello, world!");
    }

    private static void exTwo() {
        Scanner scaner = new Scanner(System.in);
        String name = scaner.nextLine();
        System.out.printf("PRIVET, %s", name);
        scaner.close();             // v dannom sluchae neobyazatelno
    }

    private static void ex3() {
        Scanner in = new Scanner(System.in);
        String name2 = in.nextLine();
        System.out.printf("Privet, hello, %s%n", name2);
    }

    private static void ex4() {
        int a = 1;      //primitiv (sokrashyonniy vizov peremennoy)
        Integer b = 1;  //rasshirenniy(ssilochniy) vizov peremennoy (mozhno pereyti v klass tipa peremennoy "int" i posmotret parametri) ctrl+leftMouse + click to name ("Integer")
        List<Integer> list;
    }

    private static void ex5() {
        int [] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1};
        int counter = 0;
        int result = 0;
        for (int num : arr) {
            if (num == 1) {
                counter++;
                if (counter > result) {
                    result = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.printf("Naibolshaya posledovatelnost '1' : %s", result);
    }

    private static int getRandomArrMaxCount(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2); // 0-1
//            arr[i] = random.nextInt(3,10);  // 3-9
        }

//        for (int i = 0; i < arr.length; i++) {        // cycle variant 1
//            int num = arr[i];
//            System.out.println(num);
//        }

        int count = 0;
        int maxCount = 0;
        for (int num : arr) {                           // cycle variant 2
            //System.out.println(num);
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        return maxCount;
    }
}
*/