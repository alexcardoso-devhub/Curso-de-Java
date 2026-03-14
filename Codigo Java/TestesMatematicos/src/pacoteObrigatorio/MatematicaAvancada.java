//ORGANIZA AS CLASSES
//EVITA CONFLITOS DE NOME
//IDES MODERNAS EXIGEM CRIAÇÃO DE PACOTES NO PROJETO
//FUNCIONA COMO PASTA LÓGICA
package pacoteObrigatorio;

//CLASSE = MOLDE
//OBJETOS SERÃO CRIADOS A PARTIR DELA
//public = VISIVEL PARA A TOTALIDADE DO PROJETO
public class MatematicaAvancada {
	
	//É UM ATRIBUTO, NÃO UMA VARIÁVEL
	//GUARDA O ESTADO DO OBJETO
	//private = ENCAPSULAMENTO
	//SÓ A PRÓPRIA CLASSE PODE ACESSAR DIRETAMENTE
	private double resultado;
    
	//MÉTODO NÃO RETORNA VALOR (VOID)
	//RECEBE PARÂMETROS
	//FAZ UMA OPERAÇÃO
	//ATUALIZA O ATRIBUTO resultado
	//USA O SETTER (BOA PRÁTICA)
	public void soma(double valor1, double valor2) {
		setResultado (valor1 + valor2);
				
	}
    //GETTER RETORNA VALOR DO ATRIBUTO
	//NAO ALTERA NADA
	//PERMITE ACESSO CONTROLADO
	//PARTE DO ENCAPSULAMENTO
	public double getResultado() {
		return resultado;
	}

	//SETTER MODIFICA O ATRIBUTO
	//this.resultado = ATRIBUTODE CLLASSE
	//resultado = PARÂMETRO DO MÉTODO
	//EVITA ACESSO DIRETO AO ATRIBUTO
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//RETORNA true OR false
	//VERIFICA UMA CONDIÇÃO
	//USA A CONVERSÃO DE TIPO DE VARIÁVEL (cast)
	public boolean par (double valorDec) {
		boolean retorno = false;
		
		//REMOVE CASAS DECIMAIS
		//CONVERTE double EM int
		int valorInt = (int) valorDec;
		
		//VERIFICA SE O NÚMERO É PAR
		//COMPARAÇÃO MATEMÁTICA
		if (valorDec/2 == valorInt/2) retorno = true;
		
		//RETORNA O RESULTADO DA LÓGICA
		return retorno;
		
	}
	
	//ERTORNA UM VALOR double
	//CALCULA PERCENTUAL
	//BASEADO EM REGRAS DE NEGÓCIO
	public double descontoSeguro (int classeBonus) {
		double retorno = 0;
		
		//SUBSTITUI VÁRIOS if/else
		//CADA case  É UM CENÁRIO
		switch (classeBonus) {
		case 1:
			retorno = 0.05; //5%
			break;
		case 2:
			retorno = 0.06; //6%
			break;
		case 3:
			retorno = 0.065; //6,5%
			break;
		case 4:
			retorno = 0.07; //7%
			break;
		case 5:
			retorno = 0.08; //8%
			break;
		case 6:
			retorno = 0.085; //8,5%
			break;
		case 7:
			retorno = 0.087; //8,7%
			break;
		case 8:
			retorno = 0.09; // 9%
			break;
		case 9:
			retorno = 0.096; //9,6%
			break;
		case 10:
			retorno = 0.10; //10%
			break;

		
		}
		return retorno;
	}    	
}