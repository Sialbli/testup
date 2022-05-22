package com.company;
import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    static Random random;
    public static void main(String[] args) {
        //        quest1
        int[] array = {1, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(change(array)));
        //        quest2
        int[] array1 = new int[8];
        System.out.println(Arrays.toString(substitution(array1)));
        //        quest3
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplication(array2)));
        //        quest4
        int[] maxMin = new int[]{12, 5, 23, -3, 1, 7, 31, 8, 35};
        System.out.println(maximum(maxMin));
        System.out.println(minimum(maxMin));
        //        quest5
        int[][] twoDimArray = new int[6][6];
        figure(twoDimArray);
        //        quest6
        int[] randomM = new int[10];
        ranDom(randomM);
        System.out.println(Arrays.toString(randomM));
        System.out.println(summa(randomM));
        System.out.println(check(randomM));
    }
    public static int[] change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }
    public static int[] substitution(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 3;
        }
        return array1;
    }
    public static int[] multiplication(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 6) {
                array2[i] *= 2;
            }
        }
        return array2;
    }
    public static int[][] figure(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                if (i == j) {
                    twoDimArray[i][j] = 1;
                }
                if (i + j == 5) {
                    twoDimArray[i][j] = 1;
                }
                System.out.print(" " + twoDimArray[i][j]);
            }
            System.out.println();
        }
        return twoDimArray;
    }
    public static int maximum(int[] maxMin) {
        int max = maxMin[0];
        for (int i = 0; i < maxMin.length; i++) {
            if (maxMin[i] > max) {
                max = maxMin[i];
            }
        }
        return max;
    }
    public static int minimum(int[] maxMin) {
        int min = maxMin[0];
        for (int i = 0; i < maxMin.length; i++) {
            if (maxMin[i] < min) {
                min = maxMin[i];
            }
        }
        return min;
    }
    public static int[] ranDom(int[] randomM) {
        random = new Random();
        for (int i = 0; i < randomM.length; i++) {
            randomM[i] = random.nextInt(10);
        }
        return randomM;
    }
    public static int summa(int[] randomM) {
        int sum = 0;
        for (int i = 0; i < randomM.length; i++) {
            sum += randomM[i];
        }
        return sum;
    }
    public static boolean check(int[] randomM) {
        int rightSum = 0;
        boolean check = false;
        for (int i = 0; i < randomM.length; i++) {
            rightSum += randomM[i];
            if (rightSum == summa(randomM) - rightSum) {
                check = true;
            }
        }
        return check;
    }
}