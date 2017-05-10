// Will take a list of fitness values as input and then calculate if the star has been taken awya by the black hole or not
// 
public class CheckLife {
	

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
