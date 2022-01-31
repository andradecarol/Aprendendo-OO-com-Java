
public class TestaEscopo {

	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		
		if(quantidadePessoas >= 2) {
			boolean acompanhado = true;
//			A variável 'acompanhado' só existe depois de declada e dentro desse bloco {}
		} else {
			boolean acompanhado = false;
//			Aqui tbm, essa variável já é uma nova e só existe dentro desse bloco {}
		}
		//boolean acompanhado = true;
//		boolean acompanhado = quantidadePessoas >= 2;
//		if(idade >= 18 && acompanhado) {			
//			System.out.println("seja bem vindo");
//		} else {			
//				System.out.println("infelizmente você não pode entrar");
//		}	
		
		
		
	}

}
