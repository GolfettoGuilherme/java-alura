package aula01;

public class ValorInvalidoException extends Exception{

	/**
	 * frescura do eclipse
	 */
	private static final long serialVersionUID = 1L;
	
	public ValorInvalidoException(double valor){
		super("Valor invalid:" + valor);
		
	}
	
}
