import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0; 
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false; 
            }
        }
        return true; 
    }
}