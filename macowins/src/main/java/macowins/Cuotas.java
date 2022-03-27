package macowins;
import java.util.Set;

public class Cuotas extends Medio{

	private int cantidad_cuotas;
	
	private double coef = 1;
	private double costo_prenda = 0.01;
	
	public Cuotas(int cantidad_cuotas)
	{
		this.cantidad_cuotas = cantidad_cuotas;
	}
	
 @Override
 public double precio_total(Set<Prenda> prendas)
 {
	 double total = super.precio_total(prendas);
	 
	 double recargo = cantidad_cuotas * coef;
	 
	 for (Prenda p : prendas)
	 {
		 recargo += p.precio_prenda() * costo_prenda;
	 }
	 
	 return total + recargo;
 }
	

}
