package by.epam.dectask.chekan.task4repeat;


import static by.epam.dectask.chekan.task4repeat.Input.enterFromConsole;
import static by.epam.dectask.chekan.task4repeat.Logic.isInArea;

public class Main{
    public static void main(String[] args) {
        System.out.println("Введите координаты точки на плоскости");
        double x = enterFromConsole("x");
        double y =  enterFromConsole("y");


        Output.outputBooleanToTheConsole(isInArea(x,y));



    }

}