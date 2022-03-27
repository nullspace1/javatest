package macowins;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Macowins {
	
	Set<Venta> ventas = new HashSet<Venta>();
	
	public void realizar_venta(Set<Prenda> prendas, Medio medio_de_pago)
	{
		double precio_total = medio_de_pago.precio_total(prendas);
		
		Venta venta_realizada = new Venta(new Date(),prendas,precio_total);
		
		agregar_venta(venta_realizada);
		
	}
	
	private void agregar_venta(Venta venta_realizada) {
		ventas.add(venta_realizada);
	}

	

	public double determinar_ganancias_en(Date fecha)
	{
	 Set<Venta> ventas_en_fecha = ventas.stream().filter((Venta v) -> v.vendidaEn(fecha)).collect(Collectors.toSet());
	 
	 double total = 0;
	 
	 for (Venta v : ventas_en_fecha)
	 {
		 total += v.ganancia;
	 }
	 
	 return total;
	 
	}
	

}
