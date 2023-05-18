import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi icin eleman sayisini girin: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci serisi: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
