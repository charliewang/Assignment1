
public class RoundingError {
	
	public void start() {
		
		final double EPSILON = 0.000001;
		
		double CalculatedAnswer = 0.1 + 0.1 + 0.1;
		double ActualAnswer = 0.3;
		boolean isEqual = Math.abs(ActualAnswer - CalculatedAnswer) < EPSILON;
		
		System.out.println(isEqual);
		System.out.println(CalculatedAnswer == ActualAnswer);
		
	}
}
