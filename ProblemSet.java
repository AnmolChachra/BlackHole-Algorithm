
public class ProblemSet {
	
	public static final double LOCATION_X_LOW = 1;
	public static final double LOCATION_X_HIGH = 10;
	public static final double LOCATION_Y_LOW = 1;
	public static final double LOCATION_Y_HIGH = 10;
	public static final double ERROR = 0.0001;
	public static final int FEATURES = 2;
	
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
