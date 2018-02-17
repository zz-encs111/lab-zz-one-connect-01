package q7_power;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Q7 Power")
class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void base1Case1() {
        assertEquals(1, solution.power(1, 1));
    }

    @Test
    void base1Case2() {
        assertEquals(1, solution.power(1, 2));
    }

    @Test
    void base1Case3() {
        assertEquals(1, solution.power(1, 3));
    }

    @Test
    void base1Case4() {
        assertEquals(1, solution.power(1, 4));
    }

    @Test
    void base2Case1() {
        assertEquals(2, solution.power(2, 1));
    }

    @Test
    void base2Case2() {
        assertEquals(4, solution.power(2, 2));
    }

    @Test
    void base2Case3() {
        assertEquals(8, solution.power(2, 3));
    }

    @Test
    void base2Case4() {
        assertEquals(16, solution.power(2, 4));
    }

    @Test
    void base2Case5() {
        assertEquals(32, solution.power(2, 5));
    }

    @Test
    void base2Case6() {
        assertEquals(64, solution.power(2, 6));
    }

    @Test
    void base2Case7() {
        assertEquals(128, solution.power(2, 7));
    }

    @Test
    void base2Case8() {
        assertEquals(256, solution.power(2, 8));
    }
}