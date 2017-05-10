
public class GlobalBestIndex {
	
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
