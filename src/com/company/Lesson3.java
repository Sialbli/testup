package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    static Scanner sc;
    static Random random;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++){ }
        System.out.println("Hello player, What's your name?");
        String name = sc.nextLine();
        System.out.printf("%s do you want play?\n", name);
        System.out.println("yes/no\n");
        String start = sc.nextLine();
        switch (start) {
            case "yes":
                System.out.println("guess the number from 0 to 10");

                int q = generator(array);
                System.out.println(q);
                int userAnswer = sc.nextInt();

                for (int i = 2; i >= 1; i--) {
                    System.out.println("You have " + i + " attempts,");
                    if (q != userAnswer) {
                        System.out.println("oh no");
                        userAnswer = sc.nextInt();
                    }
                    System.out.printf("you loh");
                    if (q == userAnswer){
                        System.out.println("Congratulations you win");
                    }
                }break;
            case "no":
                System.out.printf("too bad");
                break;
        }
    }
    static int generator(int[] array){
        int randomM = random.nextInt(array.length);
        return array[randomM];
    }
}
