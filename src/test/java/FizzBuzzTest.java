import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
   
    @Test 
    void fizzBuzzTestForNull() {
        String response = FizzBuzz.fizzBuzzString("");
        assertEquals(null, response);
    }

    @Test 
    void fizzBuzzTestForF() {
        String response = FizzBuzz.fizzBuzzString("f");
        assertEquals("Fizz", response);
    }

    @Test 
    void fizzBuzzTestForB() {
        String response = FizzBuzz.fizzBuzzString("b");
        assertEquals("Buzz", response);
    }

    @Test 
    void fizzBuzzTestForFAndB() {
        String response = FizzBuzz.fizzBuzzString("fb");
        assertEquals("FizzBuzz", response);
    }

    @Test 
    void fizzBuzzTestForFix() {
        String response = FizzBuzz.fizzBuzzString("fix");
        assertEquals("Fizz", response);
    }
}
