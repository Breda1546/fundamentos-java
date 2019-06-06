import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class PDV {

	public static void main(String[] args) {
		// Date -> trabalhar com data
		Date data = new Date();
		// Formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL); 
		
		double VT,DC,DCC,VP,T;
		DecimalFormat numero = new DecimalFormat("#0.00"); 
		Scanner leia = new Scanner(System.in); 
			System.out.println(formatador.format(data));
			System.out.println("===========");
			System.out.println("=== PDV ===");
			System.out.println("===========");
			System.out.println("");
			System.out.print("Valor Total: ");
				VT = leia.nextDouble(); 
			System.out.print("Desconto em %: ");
				DC  = leia.nextDouble(); 
				
				DCC = VT - (DC / 100 * (VT));  
			System.out.println("Total com desconto: "+ numero.format(DCC));
			System.out.println("________________________________");
			System.out.println("");
			System.out.print("Valor pago: ");
				VP = leia.nextDouble(); 
				
				T = VP - DCC; 
			System.out.println("Troco: " + numero.format(T));
		leia.close();
	}

}
