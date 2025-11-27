import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.nextLine().toCharArray();
        int[] n = new int[26];
        Arrays.fill(n,-1);

        for (int i = 0; i < c.length; i++) {
            if (n[c[i]-'a'] == -1) {
                n[c[i]-'a'] = i;
            }
        }

        for (int j : n) {
            System.out.print(j + " ");
        }
    }
}