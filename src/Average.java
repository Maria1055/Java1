import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double sum = 0;
        double sumEvenNumbers =0;
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
        for (c =1; c<=d; c++)
            if (c % 2== 0) {sumEvenNumbers = sumEvenNumbers+c;
                countEvenNumbers ++;}

        System.out.println("Среднее арифметическое: " + sum/ count);


        System.out.println("Среднее арифметическое четных чисел: " + sumEvenNumbers / countEvenNumbers);

    }
}