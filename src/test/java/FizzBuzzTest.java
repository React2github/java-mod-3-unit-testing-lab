import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testFizzBuzzStringForF() {
        String response = FizzBuzz.fizzBuzzString("f");
        assertEquals("Fizz", response);
    }

    @Test
    void testFizzBuzzStringForB() {
        String response = FizzBuzz.fizzBuzzString("b");
        assertEquals("Buzz", response);
    }

    @Test
    void testFizzBuzzStringForFAndB() {
        String response = FizzBuzz.fizzBuzzString("fb");
        assertEquals("FizzBuzz", response);
    }
}
