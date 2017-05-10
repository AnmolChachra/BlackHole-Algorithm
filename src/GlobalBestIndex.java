/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */

// This Class contains the function "value" that returns the index of the BlackHole. 
public class GlobalBestIndex {

// Takes the fitness list as the input and choose the minimum fitness value and returns it index.
public static int value(double[] l1)
	{
		int index = 0;
		double minima=9999999;
		for(int i=0;i<l1.length;i++)
		{
			if(l1[i]<minima)
			{
				minima = l1[i];
				index = i;
			}
		}
		return index;
	}

}
