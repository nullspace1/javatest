package macowins;

public class Prenda {
	
	private TipoPrenda tipo;
	private double precio;
	private Estado estado;
	
	public Prenda(TipoPrenda tipo, double precio,Estado estado)
	{
		this.tipo = tipo;
		this.precio = precio;
		this.estado = estado;
	}
	
	public TipoPrenda tipo()
	{
		return tipo;
	}
	
	public double precio_prenda()
	{
		return this.estado.calcular_precio(precio);
	}
	
	
	
	

	
	
	
	
	
	
	

}
