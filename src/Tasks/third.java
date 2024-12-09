package Tasks;
public class third {
    public static void main(String[] args) {
        // Форматированный вывод первых 10 чисел гармонического ряда
        for (int i = 1; i <= 10; i++) {
            System.out.printf("H%d = %.4f%n", i, Number(i));
        }
    }
    // Метод для расчета гармонического числа
    public static double Number(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}