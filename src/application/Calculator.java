package application;

/**
 * Berechnet das Formelrad
 * @author Joel Sahli
 * @version 26.10.2018
 */
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
		if (Double.isNaN(this.leistung) && Double.isNaN(this.strom)) {
			this.strom = iAusUundR(this.spannung, this.widerstand);
		}
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
		if (Double.isNaN(this.strom) && Double.isNaN(this.widerstand)) {
			this.strom = iAusPundU(this.leistung, this.spannung);
		}
	}
	
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */
	//FEATURE U
	public double UAusRundI(double r, double i) {
		System.out.println("r*i");
		return r * i;
	}

	public double UAusRundP(double r, double p) {
		System.out.println("Math.sqrt(p/r)");
		return Math.sqrt(p / r);
	}
	public double UAusPundI(double p, double i) {
		System.out.println("p/i");
		return p / i;
	}
	//FEATURE I
	public double iAusPundU(double p, double u) {
		System.out.println("p/u");
		return p / u;
	}
	public double iAusPundR(double p, double r) {
		System.out.println("Math.sqrt(p/r)");
		return Math.sqrt(p / r);
	}
	public double iAusUundR(double u, double r) {
		System.out.println("u/r");
		return u / r;

	}


}
