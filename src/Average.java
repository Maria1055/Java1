import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int sumEvenNumbers = 0;
        int countEvenNumbers = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int c = sc.nextInt();
        System.out.println("Введите последнее число диапазона: ");
        int d = sc.nextInt();
        for (int i = 0; c <= d; c++) {
            sum += c;
            count++;
            if (c % 2 == 0) {
                sumEvenNumbers += c;
                countEvenNumbers++;
            }
        }
        System.out.println("Среднее арифметическое: " + (double) sum / count);


        System.out.println("Среднее арифметическое четных чисел: " + (double) sumEvenNumbers / countEvenNumbers);

    }
}