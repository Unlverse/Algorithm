import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] today = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int x = sc.nextInt();
        int y = sc.nextInt();
        int day = 0;

        for (int i = 0; i < x; i++) {
            day += m[i];
        }

        day += y;
        System.out.println(today[day % 7]);
    }
}