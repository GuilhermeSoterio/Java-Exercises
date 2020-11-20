import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
public class Main {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextFloat();
		double B = input.nextFloat();
		double C = input.nextFloat();
		
		double media = (((A * 2)+ (B * 3)+ (C * 5)) / 10.0);
		
		System.out.printf("MEDIA = %.1f%n", media);
		input.close();

	}
}