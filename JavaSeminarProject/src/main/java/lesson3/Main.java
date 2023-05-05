package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        compareString();
//        randomListSort();
        planetsRandCount();
        System.out.println();
        planetsRandCountVar2();
    }

    private static void compareString() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s5);
        System.out.println(s1 == s2 & s1 == s3);
        System.out.println(s1 == s2 & s1 == s3 | s4 == s5);
    }

    private static void randomListSort() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    private static void planetsRandCount() {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "OkrestnostiJupitera", "Saturn",
                "Uranus", "Neptun", "Pluton"};
//        Integer[] arrPlanetIndex = {0,1,2,3,4,5,6,7,8,9};
        Random rand = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[rand.nextInt(10)]);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;
        int idx = 29;

        for (int i = 0; i < idx; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (i == idx - 1) {
                    sb.append(list.get(i))
                            .append(": ")
                            .append(count)
                            .append(".");
                }
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
                if (i == idx - 1) {
                    sb.append(list.get(i + 1))
                            .append(": ")
                            .append(count)
                            .append(".");
                }
            }
        }
//        sb.append(list.get(idx));
        System.out.println(sb);
    }

    private static void planetsRandCountVar2() {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "OkrestnostiJupitera", "Saturn",
                "Uranus", "Neptun", "Pluton"};
        Random rand = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[rand.nextInt(10)]);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append(list.get(list.size() - 1))
                .append(": ")
                .append(count)
                .append(".");
        System.out.println(sb);
    }
}
