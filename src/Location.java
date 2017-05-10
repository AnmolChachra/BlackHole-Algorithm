/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */

// Utility class to set the location of the star.

public class Location {
	private double[] loc;
	
	// Constructor.
	public Location(double[] loc)
	{
		this.loc = loc;
	}
	
	// Set Location of the star.
	public void setLocation(double[] loc)
	{
		this.loc = loc;
	}
	
	// Get Location of the star.
	public double[] getLocation()
	{
		return loc;
	}
}
