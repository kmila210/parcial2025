package parcialTabone2025;

public class Departamento extends Inmueble{

	public Departamento(double precio, String direccion, String tipo, int estado) {
		super(precio, direccion, tipo, estado);
	}

	public double calcularImpuesto(double precio) {
		return precio*0.8;
	}
	

}
