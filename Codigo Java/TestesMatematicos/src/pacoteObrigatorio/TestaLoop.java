package pacoteObrigatorio;

public class TestaLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Testando a estrutura while
		System.out.println("Teste de while");
		int n = 0;
		while (n < 5) {
			System.out.println(n);
			n++;
		}
		System.out.println("-");
		
		//Testando a estrutura do/while
		System.out.println("Teste de do/while");
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		System.out.println("-");
		
		//Testando a estrutura for
		System.out.println("Teste de for");
		for(int z = 0; z < 5; z++) {
			System.out.println(z);
		}
		
		int distancia = 500;
		double tanqueDeGasolina = 50;
		double quilometrosPorLitro = 8.5;
		double consumoPorQuilometro = 1 / quilometrosPorLitro;
		
		for (int decorrido = 1; decorrido <= distancia; decorrido++) {
			tanqueDeGasolina -= consumoPorQuilometro;
			System.out.println("Quilometros rodados: "+decorrido);
			if (tanqueDeGasolina <= 0) {
				System.out.println("Acabou a gasolina.");
				break;
			}
		}
	}
}
