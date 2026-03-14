package pacoteObrigatorio;

public class TestaArrayComFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definindo Arrays
		String [] a;
		String [] b;
		
		//Criando Arrays
		a = new String [5];
		b = new String [5];
		
		//Carrregando dados do Array a
		a[0] = "João";
		a[1] = "Maria";
		a[2] = "Marcos";
		a[3] = "Clara";
		a[4] = "Rogério";
		
		//Carregando dados do Array b
		b[0] = "Silva";
		b[1] = "Fernandes";
		b[2] = "Pereira";
		b[3] = "Lins";
		b[4] = "Gomes";
		
		//Exibindo dados do Array a
		for(int n = 0; n < a.length; n++) {
			System.out.println(a[n]);
		}
		System.out.println("-");
		
		//Exibindo dados do Array b
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("-");
		
		//Exibindo dados do Array a e b
		for(int z =  0; z < a.length; z++) {
			System.out.println(a[z]+" "+b[z]);
		}
	}

}
