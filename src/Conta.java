public class Conta {
	// atributos
	double saldo;
	int agencia;
	int numero;
	String titular;

	// comportamentos / m�todos (parecido com fun��o)

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}