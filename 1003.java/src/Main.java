import java.util.Scanner;
//Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int Soma = A + B;
		
		System.out.println("SOMA = "+ Soma);
		input.close();
	}
}
