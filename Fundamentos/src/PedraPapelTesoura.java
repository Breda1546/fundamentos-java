import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		/* Lógica do Jogador*/
		
		int jogador; 
		Scanner mao = new Scanner(System.in);
			System.out.println("___________________");
			System.out.println("______JoKenPo______");
			System.out.println("___________________");
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesouro");
			System.out.print("Digite a opção desejada: ");
				jogador = mao.nextInt(); 
				
				//AVISO: estrutura switch case admite apenas tipo int e char 
				switch (jogador) {
				case 1:
					System.out.println("Jogador escolheu PEDRA");
						break; 
				case 2:
					System.out.println("Jogador escolheu PAPEL");
						break; 
				case 3:
					System.out.println("Jogador escolheu TESOURA");
						break; 
				default:
					System.out.println("Opção inválida");
						break; 
				}// fim switch
				
		/* Fim lógica do jogador */
				
				
		/* Lógica do Computador*/
			// a linha abaixo geral números aleatórios entre 0 e 2
			// (int) -> converte para tipo inteiro (casting)
			// +1 -> soma 1 ao resultado (1 ou 2 ou 3)
				
		int computador = (int)(Math.random() * 3 + 1);
				
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu PEDRA");
					break; 
			case 2:
				System.out.println("Computador escolheu PAPEL");
					break; 
			case 3:
				System.out.println("Computador escolheu TESOURA");
					break; 
			}// fim switch
			
		/* Fim lógica do computador */
			
		/* Lógica de vencedor , derrota ou empate*/
			
		if (jogador == computador) {
			System.out.println("EMPATE");
		}else{
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ) {
				System.out.println("JOGADOR VENCEU");
			}else if (jogador > 3){
				System.out.println("NÃO FOI POSSIVEL EFETUAR O JOGO");
			}else{
				System.out.println("COMPUTADOR VENCEU");
			}
		}// fim if 
		
		/* Fim lógica VDE*/
		
		mao.close();
	}// fim da função static

}// fim da classe toda
