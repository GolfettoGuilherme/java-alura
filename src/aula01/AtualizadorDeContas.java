package aula01;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public void roda(Conta c){
		System.out.println("=======================");
		System.out.println("Valor de saldo Anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Valor de saldo Atual: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
}
