package SkillFactory;

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int multiple = scanner.nextInt();

            int sum = 0;
            //напишите тут ваш код
                System.out.println(sum);
        }
        int method1(int start, int end,int multiple){
        int sum = start+end;
        return sum;
        }
    }



   // В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
     //   Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
       // Для этого используй цикл for.
        //Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.