package parcialTabone2025;

public class Casa extends Inmueble{

	public Casa(double precio, String direccion, String tipo, int estado) {
		super(precio, direccion, tipo, estado);
	}
	
	
	public double calcularImpuesto(double precio) {
		if(this instanceof CasaRural) {
			return precio * 0.5;
		}else if(this instanceof CasaUrbana) { //suponemos impuesto de 8% para CasaUrbana
			return precio * 0.8;
		}
		return 0;
	}
	
}
