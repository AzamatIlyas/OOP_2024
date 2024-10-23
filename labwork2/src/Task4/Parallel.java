package Task4;

public class Parallel extends Circuit{

	private Circuit a;
	private Circuit b;
	private double v;
	
	public Parallel(Circuit a, Circuit b) {
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
		
		a.applyPotentialDiff(v);
		b.applyPotentialDiff(v);
	}
	
	
}
