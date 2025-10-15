package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {

    public String doStringConcat(String s1, String s2) {
        return s1 + " " + s2;
    }

    public int[] sortValues(int arr[]) {
        Arrays.sort(arr);
        return arr;
    }

    public boolean checkPresence(String str, String a) {
        return str.contains(a);
    }
}
package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class Assignment108 {

    @Test
    public void testDoStringConcat() {
        DailyTasks dailyTasks = new DailyTasks();

        String expected = "Hello World";
        String actual = dailyTasks.doStringConcat("Hello", "World");

        assertEquals("The concatenated string should be 'Hello World'", expected, actual);
    }
}