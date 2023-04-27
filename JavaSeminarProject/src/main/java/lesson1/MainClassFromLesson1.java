package lesson1;

import java.util.List;
import java.util.Scanner;

public class MainClassFromLesson1 {
    public static void main(String[] args) {
//        exOne();
//        exTwo();
//        ex3();
//        ex4();
        ex5();
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
        Integer b = 1;  //rasshirenniy(ssilochniy) vizov peremennoy (mozhno pereyti v klass tipa peremmoy "int" i posmotret parametri) ctrl+leftMouse + click to name ("Integer")
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
}