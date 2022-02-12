package by.epam.dectask.chekan.task6repeat;

public class Main {
    public static void main(String[] args) {
        int num1 = Input.enterFromConsole();
        int num2 = Input.enterFromConsole();
        int num3 = Input.enterFromConsole();
        int summa = Logic.res(num1, num2, num3);
        Output.outputIntToConsole(summa);
    }
}