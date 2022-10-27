import java.util.Locale;
import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		//Separador
		Locale.setDefault(Locale.US); 
		
		//Variáveis				
		//entrada de dados
		Scanner sc = new Scanner (System.in); 
        double preco = sc.nextDouble();
        double desconto;
		
		//Condição
		if (preco > 100.00) {
			desconto = preco * 0.1;
			
		}else {
			desconto = 0;
		}
		System.out.println(desconto);
	}

}
