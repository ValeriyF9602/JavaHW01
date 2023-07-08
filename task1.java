/**
 * task1
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите неотрицательное число n: ");

        int num = Integer.valueOf(iScanner.nextLine());

        iScanner.close();

        if (num >= 0) {
            int sum = 0;
            int factorial = 1;
            if (num > 0){
                for (int i = 1; i <= num; i++) {
                sum = sum + i;
                factorial = factorial * i;
                }
            }
            System.out.printf("%nn-е треугольного числа %s: %s%n%s! = %s%n%n", num, sum, num, factorial);
        }
        else {
            System.out.println("\nНеобходимо ввести неотрицательное число!\n");
        }
        
    }

    
}