import java.util.Scanner;
import java.util.Locale;


public class Condicional {
        
public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //separador
        Scanner sc = new Scanner (System.in); //entrada de dado
        
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        if (minutos > 100){
            conta = conta + (minutos - 100) * 2.0; //priorização matemática
        }  //Aqui poderia ser conta += (minutos - 100) * 2.0;
        System.out.printf("Valor é R$ %.2f%n ", conta); //printf para formatações 
        sc.close();
        
    }
}
    
	