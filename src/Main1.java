public class Main1 {
    public static void main(String[] args) {
        int i = 2;
        double sum = 0;
        do {sum += i;
            ++i;}
        while ( i <= 9);
        System.out.println("Average: " + sum/7 );
    }
}