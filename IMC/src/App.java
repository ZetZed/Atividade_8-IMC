import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.println("Informe a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é %.2f", imc);

        sc.close();
    }
}
