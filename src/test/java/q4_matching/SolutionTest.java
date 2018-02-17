package q4_matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Q4 Matching")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyString() {
        assertEquals(true, solution.isValid(""));
    }

    @Test
    void positiveCase1() {
        assertEquals(true, solution.isValid("()"));
    }

    @Test
    void positiveCase2() {
        assertEquals(true, solution.isValid("()()"));
    }

    @Test
    void positiveCase3() {
        assertEquals(true, solution.isValid("()[]"));
    }

    @Test
    void positiveCase4() {
        assertEquals(true, solution.isValid("(())"));
    }

    @Test
    void positiveCase5() {
        assertEquals(true, solution.isValid("([])"));
    }

    @Test
    void negativeCase1() {
        assertEquals(false, solution.isValid("("));
    }

    @Test
    void negativeCase2() {
        assertEquals(false, solution.isValid(")"));
    }

    @Test
    void negativeCase3() {
        assertEquals(false, solution.isValid(")("));
    }

    @Test
    void negativeCase4() {
        assertEquals(false, solution.isValid("(]"));
    }

    @Test
    void negativeCase5() {
        assertEquals(false, solution.isValid("()("));
    }

    @Test
    void negativeCase6() {
        assertEquals(false, solution.isValid("()["));
    }

    @Test
    void negativeCase7() {
        assertEquals(false, solution.isValid("()]"));
    }

    @Test
    void negativeCase8() {
        assertEquals(false, solution.isValid("([)]"));
    }

    @Test
    void negativeCase9() {
        assertEquals(false, solution.isValid("(())["));
    }

    @Test
    void negativeCase10() {
        assertEquals(false, solution.isValid("(())]"));
    }

    @Test
    void complexCase1() {
        assertEquals(true, solution.isValid("({})[]()([()]{})"));
    }

    @Test
    void complexCase2() {
        assertEquals(false, solution.isValid("({})[]()[[()]{})"));
    }
}