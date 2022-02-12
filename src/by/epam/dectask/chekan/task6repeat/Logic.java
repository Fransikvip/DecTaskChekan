package by.epam.dectask.chekan.task6repeat;

public class Logic {
    public static int res(int a, int b, int c) {

        int max;
        int min;
        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);
        return max + min;
    }
}