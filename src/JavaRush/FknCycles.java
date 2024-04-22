package JavaRush;
import java.util.Scanner;
public class FknCycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for(int i=1; i<10; i++){
        if(scanner.hasNextInt())
            count++;
            scanner.nextInt();
        }
        System.out.println(count);
    }
    }
