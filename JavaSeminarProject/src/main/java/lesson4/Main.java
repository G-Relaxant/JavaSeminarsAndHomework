/*
package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        whatFasterFromStart1();
//        System.out.println();
//        whatFasterFromStart2();
//        System.out.println();
//        whatFasterFromEnd();
//        System.out.println();
//        whatFasterToRandom();
        System.out.println();

//        FillStrToLinkList();
        FillStrToLinkListVar2Prepoda();
    }

//    private static void whatFasterFromStart1() {
//        final int SIZE = 1_000_000;
//        Random rand = new Random();
//        List<Integer> linkedList = new LinkedList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            linkedList.add(rand.nextInt());
//        }
//        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
//
//        List<Integer> arrList = new ArrayList<>();
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            arrList.add(rand.nextInt());
//        }
//        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
//    }
//
//    private static void whatFasterFromStart2() {
//        final int SIZE = 100_000;
//        Random rand = new Random();
//        List<Random> linkedList = new LinkedList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            linkedList.add(new Random());
//        }
//        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
//
//        List<Random> arrList = new ArrayList<>();
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            arrList.add(new Random());
//        }
//        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
//    }
//
//    private static void whatFasterFromEnd() {
//        final int SIZE = 100_000;
//        Random rand = new Random();
//        List<Random> linkedList = new LinkedList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            linkedList.add(0, new Random());
//        }
//        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
//
//        List<Random> arrList = new ArrayList<>();
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            arrList.add(0, new Random());
//        }
//        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
//    }
//
//    private static void whatFasterToRandom() {
//        final int SIZE = 100_000;
//        Random rand = new Random();
//
//        List<Random> linkedList = new LinkedList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            linkedList.add(null);
//        }
//        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
//
//        List<Random> arrList = new ArrayList<>();
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i < SIZE; i++) {
//            arrList.add(null);
//        }
//        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
//
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < SIZE; i++) {
//            linkedList.add(rand.nextInt(SIZE), new Random());
//        }
//        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
//        start = System.currentTimeMillis();
//        for (int i = 0; i < SIZE; i++) {
//            arrList.add(rand.nextInt(SIZE), new Random());
//        }
//        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
//    }
//
//    private static void FillStrToLinkList() {
//
//        Scanner in = new Scanner(System.in);
//        LinkedList<String> list = new LinkedList<>();
//
//        while (true) {
//            System.out.printf("Введите текст-индекс: ");
//            String text = in.nextLine();
//            String[] array = text.split("\\~");
//            int index = Integer.parseInt(array[1]);
//            String val = array[0];
//
//            if (val.equals("print")) {
//                if (list.get(index) == null) {
//                    System.out.println("Ячейка пуста");
//                } else {
//                    System.out.println(list.get(index));
//                    list.remove(index);
//                    System.out.println("Содержимое ячейки удалено");
//                }
//            } else {
//                if (index < list.size()) {
//                    list.set(index, val);
//                } else {
//                    for (int i = list.size(); i < index - 1; i++) {
//                        list.add(null);
//                    }
//                    list.add(val);
//                }
//            }
//            System.out.println(list);
//        }
//    }

    private static void FillStrToLinkListVar2Prepoda() {

        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");

        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.trim().length() == 0) {
//            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("каша не вари")) {
                break;
            }
            if (inputString.equalsIgnoreCase("print~all")) {
                printAllNotNullValues(wordsList);
                continue;
            }
            if (!inputString.contains("~")) {
                System.out.println("Строка не содержит тильду");
                continue;
            }

            String[] parts = inputString.split("\\~");

            if (parts.length != 2) {
                System.out.println("Ошибка ввода шаблона. Должно быть \"word~num\". Пример: apple~6");
                continue;
            }

            String word = parts[0];
            int num = 0;

            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }

            if (num < 1) {
                System.out.println("Введите num более 1");
                continue;
            }

            if (word.equalsIgnoreCase("print")) {
                if (!isNumberInRange(num, wordsList.size()) || valueIsNull(wordsList, num)) {
                    System.out.println("Указанного значения не существует");
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                    wordsList.remove(num - 1);
                }
            } else if (isNumberInRange(num, wordsList.size())) {
                String oldWord = wordsList.get(num - 1);

                if (valueIsNull(wordsList, num)) {
                    printAddMessage(word, num);
                } else {
                    printSetMessage(word, num, oldWord);
                }
                wordsList.set(num - 1, word);
            } else {
                int nullCount = num - wordsList.size() - 1;
                addNulls(wordsList, nullCount);
                wordsList.add(word);
                printAddMessage(word, num);
            }
        }
    }

    private static void addNulls(LinkedList<String> wordsList, int count) {
        for (int i = 0; i < count; i++) {
            wordsList.add(null);
        }
    }

    private static void printAllNotNullValues(LinkedList<String> wordsList) {
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i) != null) {
                System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
            }
        }
    }

    private static void printSetMessage(String word, int num, String oldWord) {
        System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
    }

    private static void printAddMessage(String word, int num) {
        System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
    }

    private static boolean valueIsNull(LinkedList<String> wordsList, int num) {
        return wordsList.get(num - 1) == null;
    }

    private static boolean isNumberInRange(int num, int size) {
        return num >= 1 & num <= size;
    }
}
*/