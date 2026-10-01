import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = (n - k % n) % n;

        System.out.println(answer);
    }
}