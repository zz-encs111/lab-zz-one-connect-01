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
    void before() {
        solution = new Solution();
    }

    @Nested
    class isValid {

        @Test
        @DisplayName("Empty String")
        void t1() {
            assertEquals(false, solution.isValid(""));
        }

        @Test
        @DisplayName("Case 1")
        void t2() {
            assertEquals(true, solution.isValid("()"));
        }


    }
}