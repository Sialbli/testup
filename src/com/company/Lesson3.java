package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    static Scanner sc;
    static Random random;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) { }
        System.out.println("Hello player, What's your name?");
        String name = sc.nextLine();
        System.out.printf("%s do you want play?\n", name);
        System.out.println("yes/no\n");
        String start = sc.nextLine();
        do {
            switch (start) {
                case "yes":
                    System.out.println("\nguess the number from 0 to " + (array.length - 1));
                    int q = generator(array);
                    System.out.println(q);
                    int userAnswer = sc.nextInt();
                    for (int j = 2; j >= 1; j--) {
                        if (q != userAnswer) {
                            System.out.println("sorry, not correct.");
                            System.out.println("You have " + j + " attempts.");
                            userAnswer = sc.nextInt();
                        }
                    }
                    if (q != userAnswer) {
                        System.out.printf("you lose.");
                        System.out.print("end game?\n yes / no \n");
                    }
                    if (q == userAnswer) {
                        System.out.println("*** Congratulations you win ***");
                        System.out.print("end game?\n yes / no \n");
                    }
                    break;
                case "no":
                    System.out.printf("too bad.\n");
                    System.out.println("exit?");
                    break;
            }
        }while (sc.next().equals("no"));
    }
    static int generator(int[] array){
        int randomM = random.nextInt(array.length);
        return array[randomM];
    }
}
