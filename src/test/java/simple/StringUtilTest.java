package simple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    private StringUtil stringUtil = new StringUtil();

    @Test
    public void countOccurenceOfCharacterInString_old() {
        long result = stringUtil.countOccurrenceOfCharacterInString_old("Lillpite", 'l');
        assertEquals(2, result);
    }

    @Test
    public void countOccurenceOfCharacterInString() {
        long result = stringUtil.countOccurrenceOfCharacterInString("Lillpite", 'l');
        assertEquals(2, result);
    }

    @Test
    public void reverseString2() {
        assertTrue(stringUtil.reverse2("Patrik").equals("kirtaP"));
    }

    @Test
    public void reverseString() {
        assertTrue(stringUtil.reverse("Patrik").equals("kirtaP"));
    }
}
