/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */

/*
 
 	Here we will define the problem.
 	
 	We are using Rosenbrock function - f(x,y) = (a-x)^2 + b(y-x^2)^2
 	In this particular example a and b are 1 and 100 respectively
 	Hence, function to be optimized =  f(x,y) = (1-x)^2 + 100(y-x^2)^2
 	
 	The required solution of the above function --> x = 1 and y = 1
 */
public class ProblemSet {
	
	// Limiting the search space
	
	// 1<= x <= 10 
	public static final double LOCATION_X_LOW = 1;
	public static final double LOCATION_X_HIGH = 10;
	
	// 1<= y <= 10
	public static final double LOCATION_Y_LOW = 1;
	public static final double LOCATION_Y_HIGH = 10;
	
	// Required error rate
	public static final double ERROR = 0.0001;
	
	// 2 features - x and y
	public static final int FEATURES = 2;
	
	// Evaluating the fitness value.
	public static double evaluate(Location loc)
	{
		double[] location = loc.getLocation();
		double X = location[0];
		double Y = location[1];
		double Z;
		Z = Math.pow(1-X,2)+100*Math.pow(Y-Math.pow(X,2),2);
		return Z;
	}
}
