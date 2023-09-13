import java.util.Scanner;

public class ExeBee1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double noteA = input.nextDouble();
        double noteB = input.nextDouble();
        double noteC = input.nextDouble();

        double weightA = 2;
        double weightB = 3;
        double weightC = 5;

        double media = (noteA * weightA + noteB * weightB + noteC * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f%n", media);

    }

}
