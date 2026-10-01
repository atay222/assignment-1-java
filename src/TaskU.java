import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 1 / (n % m + 1);
        int b = 1 / (m % n + 1);

        System.out.println(1 - (1 - a) * (1 - b));
    }
}