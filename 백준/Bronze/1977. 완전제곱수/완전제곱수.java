import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int temp = i * i;
            if (temp >= m) {
                sum += temp;
                min = Math.min(min, temp);
            }
        }
        
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}