
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("S?o a mesma conta!");
			
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
	}
}

// primeiraConta e segundaConta s?o refer?ncias para o mesmo objeto "Conta";
