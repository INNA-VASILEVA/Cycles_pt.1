public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1 \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Цикл " + i);
        }

        // Задание 2
        System.out.println("Задание 2 \n");
        for (int c = 10; c >= 1; c--) {
            System.out.println("Цикл C " + c);
        }

        // Задание 3
        System.out.println("Задание 3 \n");
        for (int b = 2; b <= 17; b += 2) {
            System.out.println("Цикл B " + b);
        }


        // Задание 4
        System.out.println("Задание 4 \n");
        for (int d = 10; d >= -10; d--) {
            System.out.println("Цикл D " + d);
        }

        // Задание 1.2
        System.out.println("Задание 1.2 \n");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        // Задание 2.2
        System.out.println("Задание 2.2 \n");
        for (int n = 7; n <= 98; n += 7) {
            System.out.println(n);
        }

        // Задание 3.2
        System.out.println("Задание 3.2 \n");
        for (int q = 1; q <= 512; q = q * 2) {
            System.out.println(q);
        }
        // Задание 1.3
        System.out.println("Задание 1.3 \n");
        int salary = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + salary;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");
        }

        // Задание 2.3
        System.out.println("Задание 2.3 \n");
        int salary1 = 29000;
        int total1 = 0;
        for (int m1 = 1; m1 <= 12; m1++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + m1 + ", сумма накоплений равна " + total1 + " рублей");

        }
    }
}