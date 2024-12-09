package Tasks;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод количества элементов массива
        System.out.println("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Переменные для хранения суммы, максимума и минимума
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // Цикл do while для подсчета суммы элементов массива
        int i = 0;
        do {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        } while (i < n);
        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        // Цикл for для вывода аргументов командной строки
        System.out.println("Аргументы командной строки:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Аргумент " + (j + 1) + ": " + numbers[j]);
        }
    }
}


