public class Conta {
	// atributos
	double saldo;
	int agencia;
	int numero;
	String titular;

	// comportamentos / métodos (parecido com função)

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}