import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minutes = 9 * 60
                + n * 45
                + (n / 2) * 5
                + ((n - 1) / 2) * 15;

        int hours = minutes / 60;
        int mins = minutes % 60;

        System.out.println(hours + " " + mins);
    }
}