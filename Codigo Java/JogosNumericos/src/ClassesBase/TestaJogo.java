//Define o pacote onde a classe está localizada
package ClassesBase;

//Declara a classe testa jogo
public class TestaJogo {

	//Método principal que inicia o programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria um objeto da classe Jogo e o armazena na variável j
		Jogo j = new Jogo();
		
		//Define o valor da aposta como 7 usando o método setter
		j.setAposta(7);
		//Executa lógica interna do jogo (sorteio, comparação, etc.)
		j.executaJogo();
		//Mostra no console o resultado final do jogo
		j.mostraResultado();

	}//Fecha o main

}//Fecha a classe TestaJogo
