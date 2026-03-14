//ORGANIZA O CÓDIGO
//PERMITE SEPARAR CLASSES
//OBRIGATÓRIO EM PROJETOS REAIS
package pacoteObrigatorio;

//CLASSE USADA PARA EXPERIMENTAR OPERADORES
//NÇAO GUARDA REGRAS DE NEGÓCIO
//SERVE APENAS PAARA APRENDIZADO
public class TestaOperadores {

	//PONTO INICIAL DO PROGRAMA
	//O JAVA COMEÇA A RODAR POR AQUI
	//static = NÃO PRECISA CRIAR O OBJETO DA CLASSE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIÁVEIS LOCAIS
		//TIPO int = NÚMEROS INTEIROS
		//GUARDAM VALORES NA MEMÓRIA
		int valor1 = 10;
		int valor2 = 5;
		
		//COMPARA VALORES
		//== NÃO É ATRIBUIÇÃO
		if(valor1 == valor2) System.out.println("Valor 1 é igual a valor 2.");
		
		//VERIFICA SE OS VALORES SÃO DIFERENTES
		if(valor1 != valor2) System.out.println("Valor  1 é diferente de valor 2.");
		
		//COMPARAÇÃO MATEMÁTICA DIRETA
		if(valor1 > valor2) System.out.println("Valor 1 é maior que valor 2.");
		if(valor1 < valor2) System.out.println("Valor 1 é menor que valor2.");
		
		//INCLUI IGUALDADE NA COMPARAÇÃO
		if(valor1 >= valor2) System.out.println("Valor 1 é maior ou igual a valor2.");
		if(valor1 <= valor2)System.out.println("Valor de 1 é menor ou igual a valor 2");
		
		//VARIÁVEL INTEIRA
		//REPRESENTA UM DADO DO MUNDO REAL
		int idade = 17;
		
		//TESTA CONDIÇÃO
		//SE FOR VERDADEIRA ENTRA NO if
		if (idade>18) {
			System.out.println("Você já pode dirigir.");
			System.out.println("Inscreva-de em uma autoescola");
			
			//CAMINHO ALTERNATIVO
			//EXECUTADO QUANDO  A CONDIÇÃO É FALSA
		} else {
			System.out.println("Você ainda precisa esperar para entrar na autoescola.");
			System.out.println("Tenha um pouco de paciência.");
		}
		
		//CONVERSÃO EXPLÍCITA DE double PARA int
		//PERDE CASAS DECIMAIS
		//NÃO ARREDONDA O NÚMERO, MAS CORTA A PARTE DECIMAL
		double a = 1.50;
		int b;
		b = (int) a;
		System.out.println(b);
		
		//MESMO VALOR MAS COM POS DIFERENTES, LOGO, RESULTADOS DIFERENTES
		double valorDec = 2;
		int valorInt = (int) valorDec;
		
		System.out.println("Divisão decimal: "+valorDec/2);
		System.out.println("Divisão inteiro: "+valorInt/2);
		
		//COMPARA DOIS CÁLCULOS
		//MOSTRA COMO O TIPO INFLUENCIA O RESULTADO
		if (valorDec/2 == valorInt/2) System.out.println("Mesmo resultado.");
		else System.out.println("Resultados diferentes.");
	}

}
