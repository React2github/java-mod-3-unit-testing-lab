import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testFizzBuzzStringForF() {
        String Response = FizzBuzz.fizzBuzzString("f");
        assertEquals("Fizz", Response, "fizz output");
    }

    @Test
    void testFizzBuzzStringForB() {
        String response = FizzBuzz.fizzBuzzString("b");
        assertEquals("Buzz", response, "Buzz output");
    }

    @Test
    void testFizzBuzzStringForFAndB() {
        String response = FizzBuzz.fizzBuzzString("fb");
        assertEquals("FizzBuzz", response, "Fizzbuzz");
    }
}
