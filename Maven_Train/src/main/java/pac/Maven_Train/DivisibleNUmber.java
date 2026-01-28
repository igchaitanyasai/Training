//package pac.Maven_Train;
//import java.util.Scanner;
//public class DivisibleNUmber {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter number: ");
//		int num=sc.nextInt();
//		if(num%3==0)
//		{
//			System.out.println("fizzz");
//		}
//		else if(num%5==0)
//		{
//			System.out.println("bizzz");
//		}
//		else if(num%3==0 && num%5==0)
//		{
//			System.out.println("fizzz bizzz");
//		}
//		else
//		{
//			return;
//		}	
//	}
//}
package pac.Maven_Train;
public class DivisibleNUmber {
	
	static String checkNumber(int num) {
		if(num%5==0 && num%3==0)
		{
			return "fizz bizz";
		}
		if(num%5==0)
		{
			return "fizz";
		}
		if(num%3==0)
		{
			return "bizz";
		}
		String s=num+"";
		return s;
	}
}
