package kata_malekulastar;


//Name:Malekulastar Dhudhiyawala
//E-mail:malikdudhiyawala@gmail.com
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class String_Calculator_Test {

    // p1  ----------------
    @Test
    public void emptyStringShouldReturnZero() {
        String_Calculator sut = new String_Calculator();
        assertEquals(0, sut.calculate(""));
    }
    @Test
    public void oneNumberShouldReturnItseft() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(3, sut.calculate("3"));
    }
    @Test
    public void twoNumbersShouldBeAdded() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(7, sut.calculate("2,5"));
    }
    @Test
    public void moreDigitsSupported() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(77, sut.calculate("22,55"));
    }
    // p2  ----------------
    @Test
    public void allowNnumersAsInput() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(45, sut.calculate("1,2,3,4,5,6,7,8,9"));
    }
    // p3 ------------------
    @Test
    public void supportNewLineAsSeparator() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(6, sut.calculate("1\n2,3"));
    }
    // p3 ------------------
    @Test
    public void supportForCustomDelimiter() {
    	String_Calculator sut = new String_Calculator();
        assertEquals(10, sut.calculate(";\n1;2;3;4"));
    }
    
   
}