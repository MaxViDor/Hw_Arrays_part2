import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSpending = 0;
        for (final int currentMax : arr) {
            if (currentMax > maxSpending) {
                maxSpending = currentMax;
            }
        }
        int minSpending = 200_000;
        for (final int currentMin : arr) {
            if (currentMin < minSpending) {
                minSpending = currentMin;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
    }

        public static void task3() {
            int[] arr = generateRandomArray();
            System.out.println("Задача 3");
            int summ = 0;
            for (int i : arr) {
                summ += i;
               // System.out.println(summ);
            }
            double averegeOnMoth = summ / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " +averegeOnMoth+ "рублей");
        }
        public static void task4() {
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length -1; i>= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
}