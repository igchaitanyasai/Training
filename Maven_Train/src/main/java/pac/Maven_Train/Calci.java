package pac.Maven_Train;

public class Calci {
	private MathHelp help;
	public Calci(MathHelp help)
	{
		this.help=help;
	}
	public int CalculateSum(int x,int y)
	{
		return help.add(x,y);
		
	}
}