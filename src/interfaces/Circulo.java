package interfaces;

public class Circulo implements AreaCalculavel{
	
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return this.raio * this.raio * Math.PI;
	}
	
}
