package testedeerro;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim Main");
	}

	private static void metodo1() {
		System.out.println("Inicio do m�todo 1");
		try {
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de array");
		}
		System.out.println("Fim do m�todo 2");
	}

	private static void metodo2() {
		System.out.println("Inicio do m�todo 2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {

			array[i] = i;
			System.out.println(i);

		}
		System.out.println("Fim do m�todo 2");

	}

}
