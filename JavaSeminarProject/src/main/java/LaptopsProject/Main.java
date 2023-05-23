package LaptopsProject;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ArrayList> laptArLi = new ArrayList<>();

        firstFillCatalogString(laptArLi);

        System.out.println();

        System.out.println("Каталог Ноутбуков -=ЛЭПТОПС=-");
        while (true) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1 - Выйти из каталога");
            System.out.println("2 - Добавить новую позицию(ноутбук)");
            System.out.println("3 - Распечатать весь каталог");
            System.out.println("4 - Выбрать ноутбуки по параметрам");
            System.out.println("5 - Изменить существующую позицию");
            System.out.println("6 - Удалить позицию");
            System.out.println("Введите действие: ");
            Scanner in = new Scanner(System.in);
            String read = in.nextLine();
            int get = Integer.parseInt(read);

            if (get == 1) {
                System.out.print("Закрыть каталог (y/n): ");
                read = in.nextLine();
                if (read.equalsIgnoreCase("y") || read.equalsIgnoreCase("yes")) {
                    System.out.println("Вы вышли из каталога");
                    break;
                } else {
                    continue;
                }
            } else if (get == 2) {
                createPosition(laptArLi);
            } else if (get == 3) {
                printCatalog(laptArLi);
            } else if (get == 4) {
                selectPos(laptArLi);
            } else if (get == 5) {
                changePosition(laptArLi);
            } else if (get == 6) {
                System.out.println("Для удаления позиции, выберите в основном меню пункт 5, выберите нужную позицию, и при вводе новых данных, нажимайте Enter, ничего не вводя");
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }



    private static void firstFillCatalogString(List<ArrayList> data) {    // StringList
        System.out.println();
        String lt1 = " Lenovo   #IdeaPad   #35000  #TN  #60 Hz  #Ryzen 5   #Vega 8        #8 gb  #Ssd 250 gb #Black";
        String lt2 = " Lenovo   #IdeaPad   #50000  #IPS #60 Hz  #Ryzen 5   #Vega 8        #16 gb #Ssd 500 gb #Dark grey";
        String lt3 = " Lenovo   #Legion    #80000  #IPS #120 Hz #Ryzen 7   #RTX 3060      #16 gb #Ssd 500 gb #Black";
        String lt4 = " Samsung  #laptop    #40000  #IPS #60 Hz  #Core i5   #Intel UHD     #8 gb  #Ssd 250 gb #Light grey";
        String lt5 = " Samsung  #GoodWork  #55000  #IPS #120 Hz #Ryzen 7   #Vega 11       #16 gb #Ssd 500 gb #Black";
        String lt6 = " MSI      #Energy    #90000  #IPS #144 Hz #Ryzen 7   #RTX 3070      #16 gb #Ssd 500 gb #White";
        String lt7 = " Asus     #MobilWork #45000  #IPS #60 Hz  #Core i5   #GTX 1650      #12 gb #Ssd 250 gb #Black";
        String lt8 = " HP       #laptop    #30000  #TN  #60 Hz  #Ryzen 3   #Vega 6        #8 gb  #Ssd 250 gb #Black";
        String lt9 = " Xiaomi   #Mi7       #70000  #IPS #120 Hz #Core i7   #Intel UHD     #12 gb #Ssd 500 gb #Grey";
        String lt10 = "Asus     #Tuf       #120000 #IPS #144 Hz #Ryzen 9   #RTX 2080      #16 gb #Ssd 750 gb #Black";
        String[] ltStrArr = {lt1, lt2, lt3, lt4, lt5, lt6, lt7, lt8, lt9, lt10};

        for (int i = 0; i < ltStrArr.length; i++) {
            String buffer = Integer.toString(i + 1);
            data.add(new ArrayList<String>());
            data.get(i).add(buffer);    // добавляет id в 1ую ячейку
            buffer = ltStrArr[i];
            String[] strSplitArr = buffer.split("\\#");

            for (int j = 0; j < strSplitArr.length; j++) {
                data.get(i).add(strSplitArr[j]);
            }
        }
    }

    private static void createPosition(List<ArrayList> data) {
        List<String> newPosList = new ArrayList<>();
        int indxPos = data.size() + 1;
        newPosList.add(Integer.toString(indxPos));
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите название бренда (недостающие символы заполнить пробелами, общее кол-во символов == 9): ");
        String read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите название модели (общее кол-во символов == 10): ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите стоимость (общее кол-во символов == 7): ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите тип матрицы (общее кол-во символов == 4): ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите частоту обновления экрана: ");
        read2 = in2.nextLine();
        newPosList.add(read2 + " Hz ");
        System.out.print("Введите название процессора (общее кол-во символов == 10): ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите название видеочипа (общее кол-во символов == 14): ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        System.out.print("Введите размер ОЗУ: ");
        read2 = in2.nextLine();
        newPosList.add(read2 + " gb ");
        System.out.print("Введите размер ССД: ");
        read2 = in2.nextLine();
        newPosList.add("SSD " + read2 + " gb ");
        System.out.print("Введите цвет лэптопа: ");
        read2 = in2.nextLine();
        newPosList.add(read2);
        data.add((ArrayList) newPosList);
    }

    private static void printCatalog(List<ArrayList> data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }

    private static void selectPos(List<ArrayList> data) {
        System.out.println();
        System.out.println("Выберите параметр для поиска:");
        System.out.println("1 - Бренд");
        System.out.println("2 - Модель");
        System.out.println("3 - Стоимость");
        System.out.println("4 - Матрица");
        System.out.println("5 - Частота экрана");
        System.out.println("6 - Процессор");
        System.out.println("7 - Видеочип");
        System.out.println("8 - Размер ОЗУ");
        System.out.println("9 - Размер ССД");
        System.out.println("10 - Цвет");
        String read5 = scan();
        int get2 = Integer.parseInt(read5);
        System.out.print("Введите желаемое значение выбранного параметра (необходимо указать полностью значение параметра, включая дополнительные слова, можно без пробелов): ");
        read5 = scan();
        System.out.println();
        System.out.println("Вот лэптопы, соответствующие вашему запросу:");

        for (int i = 0; i < data.size(); i++) {
            String compare2 = (String) data.get(i).get(get2);
            compare2 = compare2.replaceAll("\\s", "");
            read5 = read5.replaceAll("\\s", "");
            if (compare2.equalsIgnoreCase(read5)) {
                System.out.println(data.get(i));
            }
        }
    }

    private static void changePosition(List<ArrayList> data) {
        System.out.print("Введите номер позиции: ");
        String read3 = scan();
        Integer selPos = 0;
        for (int i = 0; i < data.size(); i++) {
            String compare = (String) data.get(i).get(0);
            if (compare.equalsIgnoreCase(read3)) {
                selPos = i;
                break;
            }
        }
        System.out.print("Введите новое название бренда (недостающие символы заполнить пробелами, общее кол-во символов == 9), (если изменяется позиция с 1й по 9ю, то первым символом ставится пробел, а общее кол-во символов == 10): ");
        read3 = scan();
        data.get(selPos).set(1, read3);
        System.out.print("Введите новое название модели (общее кол-во символов == 10): ");
        read3 = scan();
        data.get(selPos).set(2, read3);
        System.out.print("Введите стоимость (общее кол-во символов == 7): ");
        read3 = scan();
        data.get(selPos).set(3, read3);
        System.out.print("Введите тип матрицы (общее кол-во символов == 4): ");
        read3 = scan();
        data.get(selPos).set(4, read3);
        System.out.print("Введите частоту обновления экрана: ");
        read3 = scan();
        data.get(selPos).set(5, read3 + " Hz ");
        System.out.print("Введите название процессора (общее кол-во символов == 10): ");
        read3 = scan();
        data.get(selPos).set(6, read3);
        System.out.print("Введите название видеочипа (общее кол-во символов == 14): ");
        read3 = scan();
        data.get(selPos).set(7, read3);
        System.out.print("Введите размер ОЗУ: ");
        read3 = scan();
        data.get(selPos).set(8, read3 + " gb ");
        System.out.print("Введите размер ССД: ");
        read3 = scan();
        data.get(selPos).set(9, "SSD " + read3 + " gb ");
        System.out.print("Введите цвет лэптопа: ");
        read3 = scan();
        data.get(selPos).set(10, read3);
        System.out.println();
        System.out.println("Изменения внесены");
        System.out.println();
    }

    private static String scan() {
        Scanner sc = new Scanner(System.in);
        String rslt = sc.nextLine();
        return rslt;
    }
}
