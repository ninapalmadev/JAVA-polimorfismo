
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1313, 3131);
		
		Conta conta2 = new Conta(1313, 3322);
		Conta conta3 = new Conta(1313, 4546);
		Conta conta4 = new Conta(1313, 7534);
		
		
		System.out.println(Conta.getTotal());
		
		// conta está inconsistente 
		//conta.setAgencia(-50);
		//conta.setNumero(-13);
	}
}