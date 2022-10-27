import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Separador
				Locale.setDefault(Locale.US);
		//entrada de dados
				Scanner sc = new Scanner (System.in);
						
		//Variáveis
				double largura = sc.nextDouble();
				double comprimento = sc.nextDouble();
				double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();		
	}

}
//Dica útil: Ctrl + Shift + F organiza o código.