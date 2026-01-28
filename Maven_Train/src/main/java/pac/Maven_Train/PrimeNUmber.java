package pac.Maven_Train;

public class PrimeNUmber {
	static boolean prime(int num) {
		if(num==1)
		{
			return false;
		}
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
