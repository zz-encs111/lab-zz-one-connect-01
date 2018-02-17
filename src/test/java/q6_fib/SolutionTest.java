package q6_fib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Q6 Fib")
class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void case1() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    void case2() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void case3() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    void case4() {
        assertEquals(3, solution.fib(4));
    }

    @Test
    void case5() {
        assertEquals(5, solution.fib(5));
    }

    @Test
    void case6() {
        assertEquals(8, solution.fib(6));
    }

    @Test
    void case7() {
        assertEquals(13, solution.fib(7));
    }
}