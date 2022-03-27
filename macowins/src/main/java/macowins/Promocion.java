package macowins;

public class Promocion extends Estado
{
	
	private double descuento;
	
	Promocion(double descuento)
	{
	this.descuento = descuento;	
	}
	
	public void cambiar_descuento(double nuevo_descuento)
	{
		descuento = nuevo_descuento;
	}
	

	@Override
	public double calcular_precio(double precio_base) {
		return precio_base - descuento;
	}
	
}