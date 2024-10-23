package Task4;

public abstract class Circuit {
	
	public abstract double getResistance() ;
	
	public abstract double getPotentialDiff();
	
	public abstract void applyPotentialDiff(double v);
	
	public double getCurrent() {
		double potDif = getPotentialDiff();
		double resistance = getResistance();
		
		return potDif / resistance;
	}
	
	public double getPower() {
		double potDif = getPotentialDiff();
		double resistance = getResistance();
		
		return potDif * potDif / resistance;
	}
}
