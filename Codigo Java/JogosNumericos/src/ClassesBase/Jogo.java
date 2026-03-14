package ClassesBase;

import java.util.Random;

public class Jogo {
	
	//ATRIBUTOS
    private int aposta;
	private int resultado;
	
	//GETTERS E SETTERS
	public void setAposta (int aposta) {
		if (aposta > 6 || aposta < 1)
			System.out.println("APOSTA INVÁLIDA");
		this.aposta = aposta;
	}
	//MÉTODOS
	public void executaJogo () {
		this.resultado = (new Random(). nextInt(6) + 1);	
	}
	
	public void mostraResultado() {
		System.out.println("Sua aposta: "+aposta+". Resultado: "+resultado+".");
		
		if (this.resultado == this.aposta)
			System.out.println("Parabéns, você acertou!");
		else System.out.println("Errou. Mas continue tentando...");
	}
}
