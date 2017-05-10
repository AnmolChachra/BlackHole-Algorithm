/* License - MIT 
 * Author  - Anmol Chachra 
 * e-mail  - 9914103037anmol@gmail.com
 * Blog    - codeitplease.wordpress.com */

// This is the main code where magic happens.

import java.util.Vector;
import java.util.Random;
public class BlackHole implements Parameters 
{
	private Vector<Star> stars = new Vector<Star>();                   // Vector that will hold the population of Object Star.
	private double[] pbest = new double[STARS];                        // The list of fitness values.
	private Vector<Location> pBestLocation = new Vector<Location>();   // Location of the personal best
	private double gBest;                                              // Fitness value of the Black Hole which will be our global best.
	private Location gBestLocation;                                    // Location of the Black Hole.
	private double[] fitnessValueList = new double[STARS];             // List containing the fitness value of the population.
	
	Random generator = new Random();
	
	public void execute()
	{
		initializeStars();                                  // Initialize the population
		updateFitnessList();                                // Find the fitness of the population
		
		for(int i=0;i<STARS;i++)
		{
			pbest[i] = fitnessValueList[i];                 // This list will be updated in the iterations performed below
			pBestLocation.add(stars.get(i).getLocation());
		}
		
		double error = 9999;                                // Initial error
		int t = 0;                                          // Iteration tracking
		
		while(t < MAX_ITERATIONS && error > ProblemSet.ERROR)
		{
			// Get the location of the BlackHole.
			int indexBH = GlobalBestIndex.value(fitnessValueList);
			
			if( t == 0 || fitnessValueList[indexBH] < gBest)
			{
				gBest = fitnessValueList[indexBH];
				gBestLocation = stars.get(indexBH).getLocation();
				
			}
			
			// Update all the Locations of the remaining stars.
			// Updation formula - x(t+1) = x(t) + rand(BH - x(t))
			for(int i=0;i<STARS;i++)
			{
				double[] update = new double[ProblemSet.FEATURES];
				Location temploc;
				
				// Update for each feature ~ here 2 e.g. x and y.
				for(int j=0;j<ProblemSet.FEATURES;j++)
				{
					update[j] = stars.get(i).getLocation().getLocation()[j] + generator.nextDouble()*(gBestLocation.getLocation()[j] - stars.get(i).getLocation().getLocation()[j]);

					
				}
				temploc = new Location(update);		
				stars.get(i).setLocation(temploc);
				pbest[i] = stars.get(i).getFitnessVal();    // Updating the personal best fitness value.
			}
			
			// Once all the star locations have been updated
			// Check if the star is alive or got sucked into black-hole
			for(int i = 0;i < STARS;i++)
			{
				if(CheckLife.alive(stars.get(indexBH),stars.get(i),pbest)==false)
				{
					// Destroy and randomly assign a new star
					double[] l1 = new double[ProblemSet.FEATURES];
					
					l1[0] = ProblemSet.LOCATION_X_LOW + generator.nextDouble()*
							(ProblemSet.LOCATION_X_HIGH-ProblemSet.LOCATION_X_LOW);
					l1[1] = ProblemSet.LOCATION_Y_LOW + generator.nextDouble()*
							(ProblemSet.LOCATION_Y_HIGH-ProblemSet.LOCATION_Y_LOW);
					
					Location temp = new Location(l1);
					stars.get(i).setLocation(temp);
					pbest[i] = stars.get(i).getFitnessVal();
				}
			}
			error = ProblemSet.evaluate(gBestLocation) - 0;// We want error to approach 0/
		}
		
		System.out.println("Global Best X value = "+gBestLocation.getLocation()[0]);
		System.out.println("Global Best Y value = "+gBestLocation.getLocation()[1]);
		System.out.println("Z = "+gBest);
		System.out.println("Error = "+error);
		
	}
	
	
	// This function initialize the population of stars and add them to the Vector type global variable "stars".
	private void initializeStars()
	{
		Star S;
		for(int i =0;i<STARS;i++)
		{
			S = new Star();
			double[] l1 = new double[ProblemSet.FEATURES];
			
			l1[0] = ProblemSet.LOCATION_X_LOW + generator.nextDouble()*
					(ProblemSet.LOCATION_X_HIGH-ProblemSet.LOCATION_X_LOW);
			l1[1] = ProblemSet.LOCATION_Y_LOW + generator.nextDouble()*
					(ProblemSet.LOCATION_Y_HIGH-ProblemSet.LOCATION_Y_LOW);
			
			Location temp = new Location(l1);
			S.setLocation(temp);
			stars.add(S);
		}
	}
	
	// This function calculates the fitness value of the population assigned and stores them into "fitnessValueList".
	private void updateFitnessList()
	{
		for(int i=0;i<STARS;i++)
		{
			fitnessValueList[i] = stars.get(i).getFitnessVal();
		}
	}
	
}
