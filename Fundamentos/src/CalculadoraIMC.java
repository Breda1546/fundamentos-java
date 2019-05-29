import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso,altura,imc; 
		System.out.println("Cálculo do IMC");
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH); 
		DecimalFormat formatador = new DecimalFormat("#0.00"); 
		
		System.out.print("Digite seu PESO:");
			peso = leia.nextDouble(); 
			
		System.out.print("Digite sua ALTURA:");
			altura = leia.nextDouble(); 
			
			imc = peso/(altura * altura);
		System.out.println("IMC: " + formatador.format(imc));
		
		// para criar um intervalo usamos o operador AND (&&)
				if (imc < 18.5) {
					System.out.println("Abaixo do peso");
				}else if (imc >= 18.5 && imc < 25){
					System.out.println("Peso normal");
				}else if (imc > 25 && imc < 30) {
					System.out.println("Acima do peso");
				}else{
					System.out.println("Obeso");
				}
				
		leia.close();
	}

}
