package macowins;



import java.util.Calendar;
import java.util.Date;

import java.util.Set;

public class Venta {
	
	Date fecha;
	Set<Prenda> prendas_vendidas;
	double ganancia;
	
	public Venta(Date fecha, Set<Prenda> prendas_vendidas, double ganancia)
	{
		this.fecha = fecha;
		this.prendas_vendidas = prendas_vendidas;
		this.ganancia = ganancia;
	}

	public boolean vendidaEn(Date fecha) {
		Calendar fecha_venta = Calendar.getInstance();
		Calendar fecha_revisar = Calendar.getInstance();
		
		fecha_venta.setTime(this.fecha);
		fecha_revisar.setTime(fecha);
		
		boolean mismo_dia_anio = fecha_venta.get(Calendar.DAY_OF_YEAR) == fecha_revisar.get(Calendar.DAY_OF_YEAR);
		boolean mismo_anio = fecha_venta.get(Calendar.YEAR) == fecha_revisar.get(Calendar.YEAR);
		
		return  mismo_dia_anio && mismo_anio;		
	}
	

}
