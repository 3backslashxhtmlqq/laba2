import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите верхний диапазон: ");
        double n = scanner.nextDouble();
        System.out.println("Введите число для x: ");
        double b = scanner.nextDouble();
        double result = 0;
        for (double i = 0; i <= n; i++) {
            double x = Math.pow(-1, i) / (2 * i + 1) * Math.pow(b, 2 * i + 1);
            result += x;
        }
        if (result < -1) {
            System.out.println(result);
        }
    }
}