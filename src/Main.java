import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int temp = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = (3 * n + 1) / 2;
                System.out.println(n);
            }
            temp++;
        }
         System.out.println("Кол-во шагов: " + temp);
    }
}
