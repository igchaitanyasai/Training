package pac.Maven_Train;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AddtestClass {
	@Test
	void TestAdd(){
		AddClass ad=new AddClass();
		int result=ad.add(5,3);
		assertEquals(8,result);
	}
	
	@Test
	void TestPositiveNumber()
	{
	    AddClass ad=new AddClass();
	    int result=ad.add(2, 6);
	    assertEquals(true,result>0);
	}
}