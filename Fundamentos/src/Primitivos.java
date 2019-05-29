
public class Primitivos {

	public static void main(String[] args) {
		// Tipos PRIMITIVOS
		
		
		// -> tipo booleano (verdadeiro ou falso)
		boolean completo = true;
		System.out.println(completo);
		
		// -> tipo char (1 caracter unicode 'aspas simples')
		char sexo = 'F';
		System.out.println(sexo);
		
		// -> tipo byte,short,int,long (numeros inteiros)
		byte idade = 127; /*8 bits*/
		System.out.println(idade);
		
		short numero1 = 32767;/*16 bits*/
		System.out.println(numero1);
		
		int numero2 = 2147483647;/*32 bits*/
		System.out.println(numero2);
		
		long numero3 = 92233720368L;/*64 bits*/ //L para mostrar que o numero é longo
		System.out.println(numero3);
		
		// -> tipo floar,double (numero não inteiro)
		float nota1 = 5.6f;
		System.out.println(nota1);
		
		double nota2 = 7.8;
		System.out.println(nota2);
		
		// -> String (cadeia de caracter) "aspas"
		String nome = "Nicolas";
		System.out.println(nome);
		
		// -> Object (armazena qualquer coisa)
		
	}

}
