import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            char[] c = sc.nextLine().toCharArray();
            int score = 0;
            int result = 0;

            for (int j = 0; j < c.length; j++) {
                if (c[j] == 'O') {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
        }

        sc.close();
    }
}