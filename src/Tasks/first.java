package Tasks;
public class first {
    public static void main(String[] args) {
        // Инициализация массива чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Переменные для хранения суммы и среднего арифметического
        int sum = 0;
        double average;
        // Цикл для подсчета суммы элементов массива
        for (int number : numbers) {
            sum += number;
        }
        // Расчет среднего арифметического
        average = (double) sum / numbers.length;
        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}