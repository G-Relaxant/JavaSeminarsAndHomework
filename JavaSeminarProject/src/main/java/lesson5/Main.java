/*
package lesson5;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        idNameMap();

        String num = "MMCMXCIX";

//        int rslt = NumRomeToArab(num);
//        System.out.println(rslt);

//        System.out.println(NumRomeToArabVar2Prepoda(num));

//        System.out.println(NumRomeToArabVar3Prepoda(num));

        fileType("/home/Danya/Рабочий стол/JavaSeminarsAndHomework/JavaSeminarProject/src/main/resources/files");
    }

    private static void idNameMap() {
        Map<String, String> idToNameMap = new HashMap<>();
        idToNameMap.put("111111", "Oleg");                                  // put - добавление в Map(словарь)
        idToNameMap.put("222222", "Kirill");
        idToNameMap.put("333333", "Marat");
        idToNameMap.put("444444", "Katya");

        System.out.println(idToNameMap);
        System.out.println();

        for (Map.Entry<String, String> entry : idToNameMap.entrySet()) {    // entrySet
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();

        for (String key : idToNameMap.keySet()) {                           // keySet
            System.out.printf("%s\t%s%n", key, idToNameMap.get(key));
        }
        System.out.println();

        idToNameMap.forEach((key, value) -> System.out.printf("%s\t%s%n", key, value)); // == for+Map+entrySet
    }


    private static int NumRomeToArab(String num) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("I", 1);
        nums.put("V", 5);
        nums.put("X", 10);
        nums.put("L", 50);
        nums.put("C", 100);
        nums.put("D", 500);
        nums.put("M", 1000);

        int sumNum = 0;

        for (int i = 0; i < num.length() - 1; i++) {
            int curr = nums.get(num.charAt(i) + "");
            int next = nums.get(num.charAt(i + 1) + "");

            if (curr > next || curr == next) {
                sumNum += curr;
            }
            if (curr < next) {
                sumNum += next - curr;
                i++;
            }
        }

        if (nums.get(num.charAt(num.length() - 1) + "") <=
                nums.get(num.charAt(num.length() - 2) + "")) {
            sumNum += nums.get(num.charAt(num.length() - 1) + "");
        }
        return sumNum;
    }

    private static int NumRomeToArabVar2Prepoda(String num) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("I", 1);
        nums.put("V", 5);
        nums.put("X", 10);
        nums.put("L", 50);
        nums.put("C", 100);
        nums.put("D", 500);
        nums.put("M", 1000);

        int sumNum = 0;
        int next = -1;

        for (int i = 0; i < num.length() - 1; i++) {
            int curr = nums.get(num.charAt(i) + "");
            next = nums.get(num.charAt(i + 1) + "");

            if (curr < next) {
                sumNum -= curr;
            } else {
                sumNum += curr;
            }
        }
        sumNum += next;
        return sumNum;
    }

    private static int NumRomeToArabVar3Prepoda(String num) {
        Map<Character, Integer> numsDict = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romeNumSB = new StringBuilder(num.trim()).reverse();
        int arabNum = 0;
        int prev = -1;

        for (Character romeChar : romeNumSB.toString().toCharArray()) {
            int curr = numsDict.get(romeChar);

            if (curr < prev) {
                curr *= -1;
            }
            arabNum += curr;
            prev = curr;
        }
        return arabNum;
    }

    private static void fileType(String path) {
        File dir = new File(path);
        int count = 1;
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            String ext = "";

            if (file.isDirectory()) {
                ext = "dir";
            } else {
                String[] parts = file.getName().split("\\.");
                if (parts.length > 1) {
                    ext = parts[parts.length - 1];
                }
            }
            System.out.printf("%2s) Расширение файла: %s%n", count++, ext);
        }
    }
}
*/