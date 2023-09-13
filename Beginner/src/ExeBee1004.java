import java.util.Scanner;

public class ExeBee1004{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int prod = num1*num2;
        System.out.printf("PROD = %d%n" ,prod);
    }
}
