package desafiobankdio;


public class Bank {
	public static void main (String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		Conta cp = new ContaPoupanca();
		cc.transferir(50, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
