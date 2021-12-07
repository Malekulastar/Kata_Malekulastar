package kata_malekulastar;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class String_Calculator_Test {
	
 @Test
 public void emptyStringShouldReturnZero() {
    String_Calculator sut = new String_Calculator();
    assertEquals(0, sut.Adds(""));
}

}
