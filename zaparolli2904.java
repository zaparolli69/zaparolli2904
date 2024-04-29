package condicional;

import java.util.Scanner;

public class zaparolli2904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Scanner;

		class Main {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.print("Digite um número (insira 0 ou um número negativo para sair): ");
		            double numero = scanner.nextDouble();

		            if (numero <= 0) {
		                System.out.println("Programa encerrado.");
		                break;
		            }

		            exibirResultados(numero);
		        }

		        scanner.close();
		    }

		    public static void exibirResultados(double numero) {
		        double quadrado = numero * numero;
		        double cubo = numero * numero * numero;
		        double raizQuadrada = Math.sqrt(numero);

		        System.out.println("Número: " + numero);
		        System.out.println("Quadrado: " + quadrado);
		        System.out.println("Cubo: " + cubo);
		        System.out.println("Raiz Quadrada: " + raizQuadrada);
		    }
		}

	}

}
