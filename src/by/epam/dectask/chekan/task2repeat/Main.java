package by.epam.dectask.chekan.task2repeat;


import static by.epam.dectask.chekan.task2repeat.Input.enterFromConsole;
import static by.epam.dectask.chekan.task2repeat.Logic.result;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите параметры функции");

        double a;
        double b;
        double c;

        a = enterFromConsole("a");
        b = enterFromConsole("b");
        c = enterFromConsole("c");

        Output.outputDoubleToConsole(result(a,b,c));
    }

}
