package by.epam.dectask.chekan.task6repeat;

import java.util.Scanner;

public class Input {
    public static int enterFromConsole() {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        num = scanner.nextInt();
        return num;
    }
}
