package aula01;

public abstract class Conta {

	protected double saldo;

	public Conta() {
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double value) throws ValorInvalidoException {
		if(value <= 0 ){
			throw new ValorInvalidoException(value);
		} else{
			this.saldo += value;	
		}
		
	}

	public void saca(double value) {
		if (this.saldo > value) {
			this.saldo -= value;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public abstract void atualiza(double taxa);

}
