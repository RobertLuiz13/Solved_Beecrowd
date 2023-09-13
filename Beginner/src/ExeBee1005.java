import java.util.Scanner;

public class ExeBee1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double noteA = input.nextDouble();
        double noteB = input.nextDouble();
        double weightA = 3.5;
        double weightB = 7.5;

        double media = (noteA * weightA + noteB * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f%n", media);

    }
}

