import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите верхний диапазон: ");
        double n = scanner.nextDouble();
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double result = 0;
        if (x < -1) {
            for (double i = 0; i <= n; i++) {
                double numerator = -1;
                double denominator = 1;
                result += Math.pow(numerator, i + 1) / (2 * i + 1) * Math.pow(denominator, 2 * i + 1);
            }
            System.out.println(result);
        } else {
            System.err.print("насвай");
        }
    }
}
