package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class StringFormatTest {

	 StringtoUpperCase upper = mock(StringtoUpperCase.class);

     StringFormat format = new StringFormat(upper);
    @Test
    void testFormat() {
       when(upper.toUpperCase("java")).thenReturn("JAVA");

        String result = format.format("java");

        assertEquals("JAVA", result);
    }
}