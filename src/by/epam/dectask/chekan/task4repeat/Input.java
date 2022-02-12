package by.epam.dectask.chekan.task4repeat;

import java.util.Scanner;

public class Input {
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
}
