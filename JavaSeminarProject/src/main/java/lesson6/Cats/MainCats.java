/*
package lesson6.Cats;

import java.util.Scanner;

public class MainCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, 4, "Barsik", "british", "male", "20210827", "white");
        Cat cat2 = new Cat(2, 3, "Farsik", "russian", "male", "20220521", "grey");
        Cat cat3 = new Cat(3, 7, "Pusya", "african", "female", "20230715", "brown");
        Cat cat4 = new Cat(4, 4, "Kusya", "british", "female", "20220827", "grey");
        Cat cat5 = new Cat(5, 2, "Karsik", "asian", "male", "20230822", "white");
        Cat cat6 = new Cat(6, 5, "Musya", "brasil", "female", "20200513", "black");
        Cat cat7 = new Cat(7, 7, "Larsik", "indian", "male", "20211123", "white");
        Cat cat8 = new Cat(8, 6, "Busya", "african", "female", "20220930", "black");

        System.out.println();
//        System.out.printf("%s , %s , %d", cat3.firstName, cat3.colour, cat3.age);
//        System.out.println();
//        System.out.printf("%s , %s , %d", cat1.firstName, cat1.colour, cat1.age);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);
//
//        System.out.println(cat4.getId());
//
//
//        System.out.println(cat1.getFirstName());    // @Getter 33-37
//        System.out.println(cat1.getColour());
//        System.out.printf("id = %d , %s , age = %d", cat1.getId(), cat3.getSpecies(), cat3.getAge());
//        System.out.println();
//        System.out.println(cat1.getId());


        String text = "";

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.printf("Введите имя кошки(кота)/действие(all/stop): ");
            text = in.nextLine();
            if (text == cat1.firstName) {
                System.out.println(cat1);
            } else if (text == cat2.firstName) {
                System.out.println(cat2);
            } else if (text == cat3.firstName) {
                System.out.println(cat3);
            } else if (text == cat4.firstName) {
                System.out.println(cat4);
            } else if (text == cat5.firstName) {
                System.out.println(cat5);
            } else if (text == cat6.firstName) {
                System.out.println(cat6);
            } else if (text == cat7.firstName) {
                System.out.println(cat7);
            } else if (text == cat8.firstName) {
                System.out.println(cat8);
            } else if (text == "all") {
                printAll();
            } else if (text == "stop") {
                break;
            }
        }
    }

    private static void printAll() {    // пинздес метод не видит котиков
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);
        System.out.println(cat7);
        System.out.println(cat8);
    }
}
*/