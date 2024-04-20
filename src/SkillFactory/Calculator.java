package SkillFactory;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");

        float operand1 = scanner.nextFloat(); //считывает 1 число

        System.out.println("Введите операцию: +, -, *, /");

        char operation = scanner.next().charAt(0);//считывает операцию

        System.out.println("Введите второе  число");
        float operand2 = scanner.nextFloat(); //считывает 2 число

        float result;

        if (operation == '+') {
            result = operand1 + operand2;
            System.out.println("Результат: " + result);

        } else if (operation == '-') {
            result = operand1 - operand2;
            System.out.println("Результат: " + result);

        } else if (operation == '*') {
            result = operand1 * operand2;
            System.out.println("Результат: " + result);

        } else if (operation == '/') {
            result = operand1 / operand2;
            System.out.println("Результат: " + result);

        } else System.out.println("Операция не поддерживается");
        scanner.close();
    }
}








