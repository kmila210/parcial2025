package parcialTabone2025;

public class Inmueble {
	private double precio;
	private String direccion;
	private String tipo;
	private int estado; // 1 vendido / 0 a la venta

	public Inmueble(double precio, String direccion, String tipo, int estado) {
		this.precio = precio;
		this.direccion = direccion;
		this.tipo = tipo;
		this.estado = estado;
	}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = calcularImpuesto(precio);}

	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}

	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	
	public int getEstado() {return estado;}
	public void setEstado(int estado) {this.estado = estado;}
	
	public double calcularImpuesto(double precio) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Inmueble [precio=" + precio + ", direccion=" + direccion + ", tipo=" + tipo + "]";
	}
}
