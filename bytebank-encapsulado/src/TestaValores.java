
public interface TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(123, 4452);
		System.out.println("Agência: " + conta.getAgencia() + " Conta: " + conta.getNumero());
		
	}

}
