package kyu8.basicMathematicalOperations;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class testBasicOperations {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
    }
}