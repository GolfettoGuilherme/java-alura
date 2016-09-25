package aula01;

public class Program {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();

		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println("Voc� tentou depositar um valor inv�lido");
		} finally{
			System.out.println("Acabou");
		}
	}

}
