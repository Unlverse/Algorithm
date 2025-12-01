import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            char[] c = sc.nextLine().toCharArray();
            boolean isP = true;
            int count = 0;
            for (int j = 0; j < c.length / 2 + 1; j++) {
                count++;
                if(c[j] != c[c.length - 1 - j]) {
                    isP = false;
                    break;
                }
            }
            if (isP) System.out.println(1 + " " + count);
            else System.out.println(0 + " " + count);
        }
    }
}