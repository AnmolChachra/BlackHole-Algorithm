
public class Star {
	
	private Location loc;
	private double fitval;
	public Star()
	{
		super();
	}
	
	public Star(Location loc,double fitness)
	{
		super();
		this.loc = loc;
		fitval = fitness;
	}
	
	public void setLocation(Location loc)
	{
		this.loc = loc;
	}
	public Location getLocation()
	{
		return this.loc;
	}
	public double getFitness()
	{
		return fitval;
	}
	public double getFitnessVal()
	{
		fitval = ProblemSet.evaluate(this.loc);
		
		return fitval;
	}
}
