import java.util.Scanner;

public class ExeBee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        double fixSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double finalSalay = totalSales * 0.15 +fixSalary;

        System.out.printf("TOTAL = R$ %.2f%n",finalSalay);
        sc.close();
    }
}


