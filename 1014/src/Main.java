//Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double DistanciaTotal = input.nextDouble();
		double Combustivel = input.nextDouble();
		double Consumo = DistanciaTotal / Combustivel;
		
		System.out.printf("%.2f%n", Consumo);

		input.close();
    }
 
}