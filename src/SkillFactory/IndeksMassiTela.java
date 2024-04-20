package SkillFactory;

import java.util.Scanner;

public class IndeksMassiTela {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш пол");
        char gender = scanner.next().charAt(0);
        System.out.println("Введите ваш вес");
        float weight = scanner.nextFloat();
        System.out.println("Введите ваш рост");
        float height = scanner.nextFloat();


IndeksMassiTela man1 = new IndeksMassiTela();
 if (gender=='m'){
        imtMale(height,weight);
    }
    else if (gender=='f'){
        imtFemale(weight,height);
    }
    else System.out.println("Некорректный ввод. Введите f (если пол женский), либо m (если пол мужской)");

    }

    //метод для рассчета индекса массы тела для мужчин
    static float imtMale(float height1, float weight1) {
        float result = weight1 / (height1 * height1);

        if (result < 20) {
            System.out.println("У вас дефицит массы тела. Ваш индекс массы тела равен " + result);

        } else if (result <= 20 && result <= 25) {
            System.out.println("У вас нормальный вес. Ваш индекс массы тела равен " + result);

        } else if (result > 25 && result <= 30) {
            System.out.println("У вас незначительно избыточный вес. Ваш индекс массы тела равен " + result);

        } else if (result > 30 && result <= 40) {
            System.out.println("У вас ожирение. Ваш индекс массы тела равен " + result);

        } else if (result > 40) {
            System.out.println("У вас ожирение опасно для здоровья. Ваш индекс массы тела равен" + result);
        } else System.out.println("Введено некорректное значение");
        return result;
    }

    //метод для рассчета индекса массы тела для женщин
    static float imtFemale(float weight1, float height1) {
        float result = weight1 / (height1 * height1);
        if (result <= 16) {
            System.out.println("У вас дефицит массы тела. Ваш индекс массы тела равен" + result);

        } else if (result <= 17.99 && result > 16) {
            System.out.println("У вас недостаточный вес. Ваш индекс массы тела равен" + result);

        } else if (result <= 24.99 && result > 17.99) {
            System.out.println("У вас нормальный вес. Ваш индекс массы тела равен" + result);

        } else if (result >= 25 && result <= 29.99) {
            System.out.println("У вас избыточный вес. Ваш индекс массы тела равен" + result);

        } else if (result >= 30 && result <= 34.99) {
            System.out.println("У вас ожирение 1 степени. Ваш индекс массы тела равен" + result);
        } else if (result >= 35 && result <= 39.99) {
            System.out.println("У вас избыточный вес. Ваш индекс массы тела равен" + result);
        } else if (result >= 40) {
            System.out.println("У вас тяжелая форма ожирения. Ваш индекс массы тела равен" + result);
        } else System.out.println("Введено некорректное значение");
        return result;
    }
}

