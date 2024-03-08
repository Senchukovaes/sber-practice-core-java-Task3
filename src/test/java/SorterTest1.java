import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest1 {

    @Test
    public void bubbleSort() {
        int arrayA[] = new int[] {12, 14, 16, 18, 4, -4, 21, 21, 8, -999 };
        long arrayB[] = new long[] {12L, 14L, 16L, 18L, 4L, -4L, 21L, 21L, 8L, -999L};
        int actualA[] = Sorter.bubbleSort(arrayA);
        long actualB[] = Sorter.bubbleSort(arrayB);
        int expectedA[] = new int[]{-999, -4, 4, 8, 12, 14, 16, 18, 21, 21};
        long expectedB[] = new long[]{-999, -4, 4, 8, 12, 14, 16, 18, 21, 21};
        assertArrayEquals(expectedA, actualA);
        assertArrayEquals(expectedB, actualB);

    }

    @Test
    public void testBubbleSort() {
    }
}