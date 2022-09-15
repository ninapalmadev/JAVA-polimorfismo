
public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1313, 3131);
		conta.deposita(1300.0);
		conta.saca(500.0);
		
		System.out.println(conta.getSaldo());
	}

}
