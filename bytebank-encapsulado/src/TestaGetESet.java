
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 456);
		conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();		
		conta.setTitular(paulo);
		paulo.setNome("Paulo SIlveira");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		

	}

}
