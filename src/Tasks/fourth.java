package Tasks;
public class fourth {
    public static void main(String[] args) {
        int number = 5; // Пример числа для расчета факториала
        System.out.println("Факториал " + number + " = " + factorial(number));
    }
    // Метод для расчета факториала числа
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}