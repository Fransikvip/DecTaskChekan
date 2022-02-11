//false, если не принадлежит

import java.util.Scanner;

public class Task4Dec {
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

    public static boolean isInArea(double x, double y) {

        return ((y > 0) && (y <= 4 && Math.abs(x) <= 2)) ||
                ((y < 0) && (y >= -3 && Math.abs(x) <= 4));
    }

    public static void main(String[] args) {
        System.out.println("Введите координаты точки на плоскости");
        double x;
        double y;

        x = enterFromConsole("x");
        y = enterFromConsole("y");

        System.out.println(isInArea(x, y));
    }}
