package by.epam.dectask.chekan.task2repeat;

public class Logic {
    public static double result(double a, double b, double c) {
        double squarePart = Math.sqrt(b * b + 4 * a * c);

        return ((b + squarePart) / 2 * a) - (a * a * a * c)
                + (1 / (b * b));
    }
}
