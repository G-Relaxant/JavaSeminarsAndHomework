package lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqValsCount {
    public static void main(String[] args) {
        int n = 1000;
        Integer[] arr = fillArray(n);
        System.out.println(Arrays.toString(arr));
        double uniqVal = uniqValsInArr(arr);
        System.out.println(uniqVal);
    }

    private static Integer[] fillArray(int size) {
        Random rand = new Random();
        Integer[] arr2 = new Integer[size];

        for (int i = 0; i < size; i++) {
            arr2[i] = rand.nextInt(1000);
        }
        return arr2;
    }

    private static double uniqValsInArr(Integer[] arr3) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr3));
        return 1.0 * set.size() * 100 / arr3.length;
    }
}
