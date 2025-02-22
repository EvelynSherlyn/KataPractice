import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test

    public void BasicTests() {

        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(0, Kata.sum(new int[] { 6, 2}));
        assertEquals(0, Kata.sum(new int[] { 6}));
        assertEquals(2, Kata.sum(new int[] { 6, 2,1}));
        assertEquals(0, Kata.sum(new int[] {}));
    }

}