package macowins;

import java.util.Set;

public class Medio {

	public  double precio_total(Set<Prenda> prendas) {
		double total = 0;
		
		for (Prenda p : prendas)
		{
			total += p.precio_prenda();
		}
		
		return total;
	}

}
