package hometask;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCharTest {
    @Test
    public void testCase1(){
        RemoveChar r1=new RemoveChar();
        String actual=r1.removeChar("ABCD");
        assertEquals("BCD",actual);
    }
    @Test
    public void testCase2(){
        RemoveChar r1=new RemoveChar();
        String actual=r1.removeChar("AACD");
        assertEquals("CD",actual);
    }
    @Test
    public void testCase3(){
        RemoveChar r1=new RemoveChar();
        String actual=r1.removeChar("CAA");
        assertEquals("CA",actual);
    }
    @Test
    public void testCase4(){
        RemoveChar r1=new RemoveChar();
        String actual=r1.removeChar("BBAA");
        assertEquals("BBAA",actual);
    }

    @Test
    public void testCase5(){
        RemoveChar r1=new RemoveChar();
        String actual=r1.removeChar("AABAA");
        assertEquals("BAA",actual);
    }
    @Test
    public void testCase6() {
        RemoveChar r1 = new RemoveChar();
        String actual = r1.removeChar("AA");
        assertEquals("", actual);
    }
}
