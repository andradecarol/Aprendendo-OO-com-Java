
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		System.out.println(segundo);
		
		segundo = primeiro;
		primeiro = 10; //não vai fazer efeito para o segundo
					
		System.out.println(segundo);
	}
	
}
