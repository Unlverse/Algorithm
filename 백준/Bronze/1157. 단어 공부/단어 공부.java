import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        char[] text = sc.nextLine().toCharArray();
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int maxCount = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] >= 'a'  && text[i] <= 'z') {
                arr[text[i] - 'a']++;
            } else{
                arr[text[i] - 'A']++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                maxCount = 1;
            } else if (arr[i] == max) {
                maxCount++;
            }
        }

        if (maxCount == 1) System.out.println((char)(maxIndex + 'A'));
        else System.out.println("?");
    }
}