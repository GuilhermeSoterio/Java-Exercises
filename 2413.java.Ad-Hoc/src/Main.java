import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int pesquisa3 = input.nextInt();
		int pesquisa2 = 2 * pesquisa3;
		int pesquisa1 = 2 * pesquisa2;
		
		System.out.println(pesquisa1);
		input.close();
	}
}