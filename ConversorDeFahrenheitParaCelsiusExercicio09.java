package ListaDeExerc�cios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Renner Alves Martins Este � um programa que recebe o valor da
 *         temperatura em Fahrenheit e faz a convers�o desse valor para graus
 *         Celsius, imprimindo este novo valor na tela.
 */

public class ConversorDeFahrenheitParaCelsiusExercicio09 {

	public static void main(String[] args) {

		double farenheit = 0.0;
		double celsius = 0.0;
		int numeroCorreto = 0;

		

		while (numeroCorreto != 1) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insira o valor da temperatura em Fahrenheit: ");

		try {
			farenheit = scanner.nextDouble();
			numeroCorreto++;
			System.out.println();

		
		
		} catch (InputMismatchException ex) {
			System.out.println(
					"Error, insira um valor v�lido. Se possuir casas decimais" + ", fa�a a separa��o por v�rgulas.");

		}
		}
		celsius = (5 * (farenheit - 32) / 9);

		System.out.println("Calculando...");
		System.out.println(farenheit + " graus Farenheit equivalem a " + celsius + " graus celsius");
		System.out.println("Fim do programa.");
	
}
}