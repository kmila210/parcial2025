package parcialTabone2025;

import java.util.ArrayList;

public class Agente implements IVendible{
	private String nombre;
	private String apellido;
	private int idAgente;
	private ArrayList<Inmueble> inmuebles;

	public Agente(String nombre, String apellido, int idAgente, ArrayList<Inmueble> inmuebles) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idAgente = idAgente;
		this.inmuebles = new ArrayList<>();
	}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}

	public int getIdAgente() {return idAgente;}
	public void setIdAgente(int idAgente) {this.idAgente = idAgente;}

	public ArrayList<Inmueble> getInmuebles() {return inmuebles;}
	public void setInmuebles(ArrayList<Inmueble> inmuebles) {this.inmuebles = inmuebles;}
	
	@Override
	public String toString() {
		return "Agente [nombre=" + nombre + ", apellido=" + apellido + ", idAgente=" + idAgente + "]";
	}

	@Override
	public void vender(Inmueble inmuebles) {
		if(inmuebles.getEstado() == 1) {
			System.out.println("Datos del inmueble: " + inmuebles.toString());
		}else {
			System.out.println("El inmueble no fue vendido o no pertenece al vendedor");
		}
	}
}
