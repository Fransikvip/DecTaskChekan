package by.epam.dectask.chekan.task4repeat;

public class Logic{
    public static boolean isInArea(double x, double y) {

        return ((y > 0) && (y <= 4 && Math.abs(x) <= 2)) ||
                ((y < 0) && (y >= -3 && Math.abs(x) <= 4));
    }
}