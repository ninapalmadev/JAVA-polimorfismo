// administrador é um Funcionario, herda da classe funcionario
//assina contrato do Autenticavel, é um autenticavel
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do ADMINISTRADOR");
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}