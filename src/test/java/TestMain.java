import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testCorrectBinarySearch(){
        int[] arr2 = new int[]{14, 16, 19, 32, 32, 32, 32, 32, 72};
        int actual = Main.binarySearchUpperCount(arr2, 16);

        assertEquals(7,actual);
    }

    @Test
    public void test1CorrectBinarySearch(){
        int[] arr2 = new int[]{14, 16, 19, 32, 32, 32, 32, 32, 72};
        int actual = Main.binarySearchUpperCount(arr2, 32);

        assertEquals(1,actual);
    }
    @Test
    public void test2CorrectBinarySearch(){
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        int actual = Main.binarySearchUpperCount(arr, 14);

        assertEquals(8,actual);
    }
}
