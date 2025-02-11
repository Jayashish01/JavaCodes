import java.util.*;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int j = a; j <= b; j++) {
            sum += j;
        }
        System.out.println(sum);
    }
}
