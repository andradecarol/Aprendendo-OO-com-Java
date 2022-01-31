
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo );
		
		Conta segundaConta = primeiraConta;	//as duas contas passam a se referenciar para o MESMO objeto	
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo );
		

	}

}