import java.util.Scanner;

public class ExeBee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int workedHours = sc.nextInt();
        double hourlyRate = sc.nextDouble();

        double salary = workedHours * hourlyRate;

        System.out.println("NUMBER = "      +number);
        System.out.printf ("SALARY = U$ %.2f%n",salary);
      sc.close();
    }
}

