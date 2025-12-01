import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[26];
        boolean found = false;

        for (int i = 0; i < T; i++) {
            char c = sc.nextLine().charAt(0);
            arr[c - 97]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 4) {
                System.out.print((char)(i + 97));
                found = true;
            }
        }

        if(!found) System.out.println("PREDAJA");
    }
}