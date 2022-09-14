
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(13131, 2224);
		//conta.numero = 1313;
		conta.setNumero(1313);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		
		
		conta.getTitular().setProfissao("dev");
		//agora em duas linhas 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("dev");
		
		System.out.println(paulo);
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		
	}
}
