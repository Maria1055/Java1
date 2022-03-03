import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double sum = 0;
        int countEvenNumbers = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int c  = sc.nextInt();
        System.out.println("Введите последнее число диапазона: ");
        int d =sc.nextInt();
        do {sum += c;
                ++c; count ++;}
            while ( c <= d);

        System.out.println("Среднее арифметическое: " + sum/ count);

        System.out.println("Введите первое число диапазона: ");
        int a = sc.nextInt();
        System.out.println("Введите последнее число диапазона: ");
        int b = sc.nextInt();
        while (a <= b) {
            if (a % 2 == 0) {
                sum += a;
                ++a;
                count++;
            }
        }
        System.out.println("Среднее арифметическое четных чисел: " + sum / countEvenNumbers);

    }
}