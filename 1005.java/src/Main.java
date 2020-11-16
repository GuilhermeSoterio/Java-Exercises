import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double media = ((A * 3.5)+ (B * 7.5)) / 11.0;
		
		System.out.printf("MEDIA = %.5f%n", media);

		input.close();
    }
 
}
