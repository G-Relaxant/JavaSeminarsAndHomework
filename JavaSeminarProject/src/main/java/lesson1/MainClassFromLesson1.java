package lesson1;

import java.util.List;
import java.util.Scanner;

public class MainClassFromLesson1 {
    public static void main(String[] args) {
        exOne();
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

    }
}