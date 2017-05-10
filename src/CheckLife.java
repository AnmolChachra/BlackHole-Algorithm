/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */


// This class contains the *alive* function that return a boolean value where true = star alive and false = star dead
public class CheckLife {

	/* Arguments - 
	 		BH      - the blackhole of type<Star>
			s       - the star we want to check the status
			fitlist - the list of type<double> containing fitness value of each star
	   Return - 
	   		Boolean
	*/
	public static Boolean alive(Star BH,Star s, double[] fitlist)
	{

		Location loc_bh,loc_s;
		double distance,R,Allsum=0;
		
		
		for(int i=0;i<fitlist.length;i++)
		{
			Allsum+=fitlist[i];
		}
		
		R = BH.getFitness()/Allsum;
		loc_bh = BH.getLocation();
		loc_s = s.getLocation();
		distance = Math.pow(loc_bh.getLocation()[0] - loc_s.getLocation()[0],2)+Math.pow(loc_bh.getLocation()[1] - loc_s.getLocation()[1],2);
		if(distance < R)
		return false;
		else
		return true;
	}
	

}
