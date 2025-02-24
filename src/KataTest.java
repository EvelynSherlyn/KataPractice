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
    @Test
    public void MoreTests() {
        assertEquals(110, Kata.sum(new int[] {20,22,28,40,100,12}));
        assertEquals(210, Kata.sum(new int[] {20,22,28,40,101,100,12}));
        assertEquals(672, Kata.sum(new int[] {59,22,28,40,100,321,123,300,12}));
    }
}