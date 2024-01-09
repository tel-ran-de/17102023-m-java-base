import org.example.Practice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

    @Test
    public void findMaxValueSuccess() {
        Integer[] arr = {1, 4, 10};
        Integer max = 10;
        assertEquals(max, Practice.findMaxValue(arr));
    }

    @Test
    public void findMaxWrongValueSuccess() {
        Integer[] arr = {1, 4, 10};
        Integer max = 100;
        assertNotEquals(max, Practice.findMaxValue(arr));
    }

    @Test
    public void isNotEmptyInitArraySuccess() {
        Integer[] arr = Practice.initArray();
        Integer arrExpLength = 3;
        assertEquals(arrExpLength, arr.length);
    }

    @Test
    public void isNotEmptyArraySuccess() {
        Integer[] arr = Practice.initArray();
        Integer arrExpLength = 0;
        assertNotEquals(arrExpLength, arr.length);
    }

    @Test
    public void findMaxValueTrueSuccess() {
//        Integer[] arr = Practice.initArray();
//        Integer max = 3;
//        assertTrue(max == arr.length);
        assertTrue(3 == Practice.initArray().length);
    }

    @Test
    public void findMaxValueFalseSuccess() {
        Integer[] arr = {1, 4, 10};
        Integer max = 100;
        assertFalse(max == arr.length);
    }
}
