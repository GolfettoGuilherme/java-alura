package aula01;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	void adiciona(Tributavel t){
		System.out.println("Adicionado tributavel:" + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}

}
