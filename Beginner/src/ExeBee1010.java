import java.util.Scanner;

public class ExeBee1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double preco2 = sc.nextDouble();
        
        double calc = (qtd1 * preco1) + (qtd2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", calc);
        sc.close();
    }
}

