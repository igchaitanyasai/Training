package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CalciTest {
	MathHelp help= new MathHelp();
	Calci cal=new Calci(help);
	
	@Test
	void CalculateSumTest() {
		int result=cal.CalculateSum(8, 8);
		assertEquals(16,result);
	}
}


//with mocking
//public class CalciTest {
//	MathHelp help=mock(MathHelp.class);
//	Calci cal=new Calci(help);
//	
//	@Test
//	void CalculateSumTest() {
//		//stubbing
//		when(help.add(8, 8)).thenReturn(16);
//		//act
//		int result=cal.CalculateSum(8, 8);
//		//Assert
//		assertEquals(16,result);
//	}
//}



//with mocking
//@ExtendWith(MockitoExtension.class)
//public class CalciTest {
//	@Mock
//	MathHelp help;
//	@InjectMocks
//	Calci cal;  //help is null value
//	
//	@Test
//	void CalculateSumTest() {
//		//stubbing
//		when(help.add(8, 8)).thenReturn(16);  //here help will add and becomes 16
//		//act
//		int result=cal.CalculateSum(8, 8);
//		//Assert
//		assertEquals(16,result);
//	}
//}