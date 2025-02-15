package Util;

public class CurrencyConverter {
	public static final double IOF = 0.06;	
	
	public static double Conversao(double p, double d) {
			return p * d * IOF + (p * d);
		}
		
		
}
