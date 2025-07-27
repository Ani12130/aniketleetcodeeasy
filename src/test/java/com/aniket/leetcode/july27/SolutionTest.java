    package com.aniket.leetcode.july27;

    import org.junit.Test;

    import static org.junit.Assert.assertEquals;

    public class SolutionTest {
    Solution so = new Solution();

        @Test
        public void testAllScenarios() {
            boolean result = so.canConstruct("a","b");
            boolean result_one = so.canConstruct("aa","ab");
            boolean result_two = so.canConstruct("aa","aab");
            assertEquals(false,result);
            assertEquals(false,result_one);
            assertEquals(true,result_two);
        }
    }
