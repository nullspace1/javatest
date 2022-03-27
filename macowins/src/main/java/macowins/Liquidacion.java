package macowins;

public class Liquidacion extends Estado {

	private double liq_valor = 0.5;
	
	
	@Override
	public double calcular_precio(double precio_base) {
		return precio_base * liq_valor;
	}
	

}
