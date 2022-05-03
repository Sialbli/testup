public class mainCl {
    public static void main(String[] args) {
        System.out.println("1 задание.\n");

        System.out.println("Hello Никита!\n");

        System.out.println("2 задание. \n");

        byte q = 1;
        System.out.println("byte " + q);
        short w = 13370;
        System.out.println("short " + w);
        int e = 2;
        System.out.println("int " + e);
        long r = 30000000l;
        System.out.println("long " + r);
        float t = 13.37f;
        System.out.println("float " + t);
        double y = 123.123;
        System.out.println("double " + y);
        char u = '\u2222';
        System.out.println("char " + u);
        boolean bool = true;
        int o = 3, p = 1;
        if (o < p) {
            System.out.println("O меньше P");
        }
        if (o == p) {
            System.out.println("O равно P");
        }
        if (o > p) {
            System.out.println("O больше P\n");
        }


        System.out.println("3 задание.\n");


        int a = 10;
        int b = 5;
        int c = 4;
        int d = 2;
        int rez = a * (b + (c / d));
        System.out.println("результат = " + rez);


        System.out.println("\nЗадание 4.\n");


        int f = 10, g = 11;
        int h = f + g;
        boolean boolL = true;

        if (h >= 10 && h <= 20) {
            System.out.println("true");

        }
        if (h >= 11 && h <= 21){
            System.out.println("false");
        }

        System.out.println("\nЗадание 5.\n");

        int j = 0;
        if (j >= 0){
            System.out.println("j положительное");
        }
        if (j <= -1){
            System.out.println("j отрицательное");
        }

        System.out.println("\nЗадание 6.\n");

        int k = -5555;
        if (k <= -1){
            System.out.println("true");
        }

        System.out.println("\nЗадание 7.\n");
        String name = "Никита";
        System.out.println (name);





    }
}