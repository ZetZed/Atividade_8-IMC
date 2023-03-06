import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.println("Informe a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é %.2f . ", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso normal.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Você está com obesidade grau 1.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Você está com obesidade grau 2.");
        } else {
            System.out.println("Você está com obesidade grau 3.");
        }

        sc.close();
    }
}
