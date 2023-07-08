/**
 * task2
 * Вывести все простые числа от 1 до 1000
 */
public class task2 {

    public static boolean isPrime(int number) {
        if (number == 1) { // единица не является простым числом, так как у него только один натуральный делитель
            return false;
        }
        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println("Простые числа от 1 до 1000:");

        for (int i = 1; i < 1001; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}