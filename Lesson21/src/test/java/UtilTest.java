import org.example.Util;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UtilTest {
//    @BeforeEach
//    public void testBeforeEach() {
//        System.out.println("Hello");
//    }
//
//    @AfterEach
//    public void testAfterEach() {
//        System.out.println("Buy");
//    }
//
//    @BeforeAll
//    public static void testBefore() {
//        System.out.println("Before all");
//    }
//
//    @AfterAll
//    public static void testAfter() {
//        System.out.println("After all");
//    }
//

    @Test
    public void getNumberArraySuccessTest() {
        Integer[] arr = {1, 2, 3};
        assertEquals(Arrays.toString(arr), Arrays.toString(Util.getNumber()));
    }

    @Test
    public void getNumberArrayNotEqualsSuccessTest() {
        Integer[] arr = {1, 2, 4};
        assertEquals(Arrays.toString(arr), Arrays.toString(Util.getNumber()));
    }
}
