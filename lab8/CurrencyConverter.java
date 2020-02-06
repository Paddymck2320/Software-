
public class CurrencyConverter implements BaseCurrency {
	
		private double euros;
		private double dollars;
		private double yuan;
		private double pounds;
	
	public CurrencyConverter() 
		{
			super();
			euros = 0.909176;
			dollars = 1.0;
			yuan = 7.69532;
			pounds = 0.84161;
		}
	public void setDollars(double i) {
		dollars = i;
	}
	public double getDollars() {
		return dollars;
	}
	
	public void setEuros(double i) {
		euros = i * 0.909176;
	}
	public double getEuros() {
		return euros;
	}
	
	public void setYuan(double i) {
		yuan = i * 7.69532;
	}
	public double getYuan() {
		return yuan;
	}
	
	public void setPounds(double i) {
		pounds = i * 0.84161;
	}
	public double getPounds() {
		return pounds;
	}
}
