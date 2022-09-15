
public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //o compilador sabe que quer sobrescrever o método
	public void saca(double valor) { //o método saca que é chamado é o da CC
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
