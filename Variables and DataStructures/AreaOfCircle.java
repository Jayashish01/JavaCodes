import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float side = sc.nextFloat();
            float area = side * side;
            System.out.println(area);
        }
    }
}
