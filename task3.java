/**
 * task3
 * Реализовать простой калькулятор
 */
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("\nВведите число a: ");
        int a = iScanner.nextInt();

        System.out.print("Введите число a: ");
        int b = iScanner.nextInt();

        System.out.print("\nВыберите действие:\n\t1. Сложение\n\t2. Вычитание\n\t3. Умножение\n\t4. Деление\nНомер действия: ");
        int action = iScanner.nextInt();

        iScanner.close();

        if (action > 0 && action < 5) {

            if (action == 1) {
                System.out.printf("%s + %s = %s%n", a, b, a + b);
            }
            else if (action == 2) {
                System.out.printf("%s - %s = %s%n", a, b, a - b);
            }
            else if (action == 3) {
                System.out.printf("%s * %s = %s%n", a, b, a * b);
            }
            else if (action == 4) {
                if (b != 0) {
                    System.out.printf("%s / %s = %s%n", a, b, a / b);
                }
                else {
                    System.out.println("Деление на ноль");
                }
            }
        }
        else {
            System.out.println("Такого действия нет!");
        }
    }
}