package application;

/**
 * Berechnet das Formelrad
 * @author Joel Sahli
 * @version 26.10.2018
 */
//merge conflict
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}

	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
//test3
		if (Double.isNaN(this.leistung) && Double.isNaN(this.spannung)) {
			this.spannung = UAusRundI(this.strom, this.widerstand);
		}
		if (Double.isNaN(this.spannung) && Double.isNaN(this.strom)) {
			this.spannung = UAusRundP(this.widerstand, this.leistung);
			this.strom = UAusRundP(this.widerstand, this.leistung);
		}
		if (Double.isNaN(this.spannung) && Double.isNaN(this.widerstand)) {
			this.spannung = UAusPundI(this.leistung, this.strom);
		}
	}
	
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */
//test5
	public double UAusRundI(double r, double i) {
		System.out.println("r*i");
		return r * i;
	}
	//test
	//test2
	public double UAusRundP(double r, double p) {
		System.out.println("Math.sqrt(p/r)");
		return Math.sqrt(p / r);
	}
	public double UAusPundI(double p, double i) {
		System.out.println("p/i");
		return p / i;
	}

}
