package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test1 {
	@Test
public void test() {
	App t1=new App();
	int res=t1.add();
	assertEquals(30, res);
}
}
