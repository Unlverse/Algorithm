import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); 
        char[] c = sc.next().toCharArray();
        long R = 31;
        long M = 1234567891;
        long sum = 0;
        long power = 1; 
        
        for (int i = 0; i < L; i++) {
            long value = c[i] - 96;
            long temp = (value * power) % M;

            sum = (sum + temp) % M;
            power = (power * R) % M;
        }
        System.out.println(sum);
    }
}