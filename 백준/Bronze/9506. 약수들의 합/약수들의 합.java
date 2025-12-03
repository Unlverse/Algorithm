import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int sum = 0;
            ArrayList<Integer>temp = new ArrayList<>();

            if(n == -1) break;

            for (int i = 1; i < n; i++) {
                if(n % i == 0) {
                    temp.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 0; i < temp.size() - 1; i++) {
                    System.out.print(temp.get(i) + " + ");
                }
                System.out.println(temp.get(temp.size() - 1));
            } else System.out.println(n + " is NOT perfect.");
        }
    }
}