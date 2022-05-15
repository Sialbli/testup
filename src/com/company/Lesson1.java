package com.company;

public class Lesson1 {
    //  lesson 1.
    public static void main(String[] args) {
//      lesson 2
        boolean b = false;
        byte bt = 1;
        char c = 'R';
        short s = 123;
        int i = 1234;
        long l = 1234567L;
        float f = 123.0f;
        double db = 123.123;
        System.out.println("boolean - " + b);
        System.out.println("byte - " + bt);
        System.out.println("char - " + c);
        System.out.println("short - " + s);
        System.out.println("int - " + i);
        System.out.println("long - " + l);
        System.out.println("float - " + f);
        System.out.println("double - " + db);
//      lesson 3.
        System.out.println(rez(10, 2, 3, 5));
//      lesson 4.
        System.out.println(bollin(1, 22));
//      lesson 5.
        positiveOrNot(-3);
//      lesson 6.
        System.out.println(negativeOrNot(65));
//      lesson 7.
        printName("Kolya");
//      lesson 8.
        leapYear(1998);
    }
    public static boolean bollin(int a, int b) {
        int sum = a + b;
        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static double rez(double a, double b, double c, double d) {
        return (a * (b + (c / d)));
    }
    public static void positiveOrNot(int number) {
        if (number >= 0) {
            System.out.println("положительное");
        }
        if (number <= -1) {
            System.out.println("отрицательное");
        }
    }
    public static boolean negativeOrNot(int number) {
        return number < 0;
    }
    public static void printName(String name){
        System.out.println("Привет ," + name +"!");
    }
    public static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}