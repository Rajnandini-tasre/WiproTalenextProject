package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

public class TestSort {
    @Test
    public void testSortValue() {
        int[] arr = {3, 1, 2};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, Sorter.SortValue(arr));
    }
}

public class Assignment111 {
    @Test
    public void testCheckPresent() {
        int[] arr = {5, 2, 8};
        int[] expected = {2, 5, 8};
        assertArrayEquals(expected, Sorter.SortValue(arr));
    }
}

public class AnotherTestClass {
    @Test
    public void testSomething() {
        // Example test
        int a = 10;
        int b = 20;
        assert(a + b == 30);
    }
}
