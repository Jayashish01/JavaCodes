import java.util.Scanner;


public class BillCalculator{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the of a pencil: ");
            float pencilCost = sc.nextFloat();

            System.out.println("Enter the cost of a pen: ");
            float penCost = sc.nextFloat();

            System.out.println("Enter the cot of an eraser: ");
            float eraserCost = sc.nextFloat();

            float sum =  pencilCost + penCost + eraserCost; //Jayashish
            
            float GST = sum + (18*sum)/100;
            System.out.println(sum);
            System.out.println(GST);
        }
    }
}