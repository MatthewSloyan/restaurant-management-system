package system;

public interface Bonus {
	//public static and final implicitly 
	public double BONUS = 200.00;
	
	//Abstract method
	double addBonus(double weeklywage, double BONUS); 
	
	//default methods
	default void displayBonus(){
		System.out.println(BONUS);
	}
}
