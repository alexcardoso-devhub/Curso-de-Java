//ORGANIZA AS CLASSES
//PERMITE QUE TestaSoma ENXERGUE MatematicaAbancada
//FUNCIONA COMO UMA PASTA LÓGICA
package pacoteObrigatorio;

//CLASSE USADA PARA TESTAR UM PROGRAMA
//CONTÉM O MÉTODO main
//NÃO GUARDA LÓGICA DE NEGÓCIO, SÓ TESTA
public class TestaSoma {

	//PONTO DE ENTRADA DO PROGRAMA
	//O JAVA COMEÇA A EXECUÇÃO AQUI
	//static = NÃO PRECISA CRIAR UM OBJETO DE CLASSE
	//String[] args = ARGUMENTOS DA LINHA DE COMANDO
	public static void main(String[] args) {
		
		//CRIADO AUTOMATICAMENTE PELO Eclipse
		//NÃO TEM EFEITO NO CÓDIGO
		//PODE SER APAGADO SEM PROBLEMA
		// TODO Auto-generated method stub
		
		//INSTÂNCIA DO OBJETO
		//ma É A REFERÊNCIA
		//A PARTIR DAQUI VOCÊ ACESSA MÉTODOS
		//SEM ISSO, NÃO HÁCOMO USAR A CLASSE
		MatematicaAvancada ma=new MatematicaAvancada();
		
		//EXECUTA O MÉTODO soma
		//PASSA VALORES COMO PARâMETROS
		//ATUALIZA O ATRIBUTO resultado INTERNAMENTE
		//NÃO RETORNA NADA (void)
		ma.soma(900,750);
		
		//LÊ O VALOR DO ATRIBUTO resultado
		//USA ENCAPSULAMENTO
		//ARMAZENA EM UMA VARIÁVEL LOCAL
		//getter = APENAS LEITURA
		double valorSeguro = ma.getResultado();
		
		//EXIBE INFORMAÇÕES PARA O USUÁRIO
		//println = PULA A LINHA
		//CONCATENAÇÃO DO TEXTO + VARIÁVEL
		System.out.println("Valor do Seguro .............:"+valorSeguro);
		
		//CHAMA O MÉTODO BOOLEANO
		//SE RETORNA true, ENTRA NO if
		//SE RETORNA false, ENTRA NO else
		if (ma.par(valorSeguro)) {
			
			//EXECUTA SE A CONDIÇÃO FOR VERDADEIRA
			System.out.println("------------------->Este número é par.");
			
			//CAMINHO ALTERNATICO
		} else {
			
			//EXECUTA SE A CONDIÇÃO FOR FALSA
			System.out.println("------------------->Este número é ímpar.");
		}
		
		//CHAMA MÉTODO QUE RETORNA double
		//USA REGRA DE NEGÓCIO
		//CLASSE BÔNUS 5 DEFINE O PERCENTUAL
		double fatorDesconto = ma.descontoSeguro(5); //Classe Bônus 5;
		
		//CALCULA O VALOR DO DESCONTO
		double seguroDesconto = valorSeguro * fatorDesconto;
		
		//CALCULA O VALOR FINAL DO SEGURO
		double seguroFinal = valorSeguro - seguroDesconto;
		
		//MOSTRA RESULTADO COMPLETO
		//FACILITA CONFERÊNCIA
		//ÚTIL PARA TESTES E APRENDIZADO
		System.out.println("Fator de desconto .....: "+fatorDesconto);
		System.out.println("Valor do desconto......: "+seguroDesconto);
		System.out.println("Seguro com desconto....: "+seguroFinal);
		
	}

}
