
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;
		if(idade >= 18 && acompanhado) {			
			System.out.println("seja bem vindo");
		} else {			
				System.out.println("infelizmente você não pode entrar");
		}	
		
		
		
	}

}
