package parcialTabone2025;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de inmuebles
		CasaUrbana casaU1 = new CasaUrbana(50000, "Calle Falsa 123", "CASA", 1);
		CasaRural casaR1 = new CasaRural(25000, "Mar de ajo", "CASA", 1);
		Departamento depto1 = new Departamento(75000, "Palermo", "DEPTO", 1);
		CasaUrbana casaU2 = new CasaUrbana(45000, "San Bernardo", "CASA", 1);
		CasaRural casaR2 = new CasaRural(40000, "Mar del plata", "CASA", 1);
		Departamento depto2 = new Departamento(90000, "Pinamar", "DEPTO", 1);
		
		
		//Inmuebles del vendedor ag1
		ArrayList<Inmueble> inmuebleag1 = new ArrayList<>();
		inmuebleag1.add(depto1);
		inmuebleag1.add(casaR1);
		inmuebleag1.add(casaU1);
		
		Agente ag1 = new Agente("Juan", "Perez", 012, inmuebleag1);
		
		//Inmuebles del vendedor ag2
		ArrayList<Inmueble> inmuebleag2 = new ArrayList<>();
	    inmuebleag2.add(depto2);
		inmuebleag2.add(casaR2);
		inmuebleag2.add(casaU2);
				
		Agente ag2 = new Agente("Juan", "Perez", 012, inmuebleag2);
		
		ag1.vender(casaR2);
		if(casaR2.getEstado() == 1) {
			System.out.println("Total con impuestos: " + (double) (casaR2.getPrecio() + casaR2.calcularImpuesto(casaR2.getPrecio())));
		}
		ag1.vender(depto1);
		if(depto1.getEstado() == 1) {
			System.out.println("Total con impuestos: " + (double) (depto1.getPrecio() + depto1.calcularImpuesto(depto1.getPrecio())));
		}
		
		ag2.vender(casaR2);
		if(casaR2.getEstado() == 1 ) {
			System.out.println("Total con impuestos: " + (double) (casaR2.getPrecio() + casaR2.calcularImpuesto(casaR2.getPrecio())));
		}
		ag2.vender(casaU2);
		if(casaU2.getEstado() == 1) {
			System.out.println("Total con impuestos: " + (double) (casaU2.getPrecio() + casaU2.calcularImpuesto(casaU2.getPrecio())));
		}
	}

}
