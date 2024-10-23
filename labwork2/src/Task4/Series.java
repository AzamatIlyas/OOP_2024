package Task4;

public class Series extends Circuit{
	
	private Circuit a;
	private Circuit b;
	private double v;
	
	public Series(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}
	
	@Override
	public double getPotentialDiff() {
		return v;
	}
	
	@Override
	public void applyPotentialDiff(double v) {
		this.v = v;
		
		double total = getResistance();
		double current = v / total;
		
		a.applyPotentialDiff(current * a.getResistance());
		b.applyPotentialDiff(current * b.getResistance());
	}
	
	
}
