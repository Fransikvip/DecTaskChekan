

import java.util.Scanner;

public class Task2Dec {
        public static double result(double a, double b, double c) {
            double squarePart = Math.sqrt(b * b + 4 * a * c);

            return ((b + squarePart) / 2 * a) - (a * a * a * c)
                    + (1 / (b * b));
        }

        public static double enterFromConsole(String message)
        {
            Scanner in;
            in = new Scanner(System.in);
            System.out.print(message + " ");
            double aDouble;
            while (!in.hasNextDouble()) {
                in.next();
                System.out.print(message + " ");
            }
            aDouble = in.nextDouble();
            return aDouble;
        }

        public static void main(String[] args) {
            System.out.println("Введите параметры функции");

            double a;
            double b;
            double c;

            a = enterFromConsole("a");
            b = enterFromConsole("b");
            c = enterFromConsole("c");
            System.out.println("result=" + result(a, b, c));

        }
    }

