package EasyCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calc_Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("First number: ");
        double firstNum = scr.nextDouble();

        System.out.println("Second number: ");
        double secondNum = scr.nextDouble();
        Functions functions = new Functions();

        double sum = functions.sum(firstNum, secondNum);
        System.out.println("sum = " + sum);

        double differenceNum = functions.differenceNum(firstNum, secondNum);
        System.out.println("differenceNum = " + differenceNum);

        double multiply = functions.multiply(firstNum, secondNum);
        System.out.println("multiply = " + multiply);

        double attitude = functions.attitude(firstNum, secondNum);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("attitude = " + df.format(attitude));
    }
}