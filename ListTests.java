import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    // Issue with Merge is that it can result in an infinite loop when
    // compareTo returns a negative value
    @Test
    public void testMergeLists() {
        String[] stringarr1 = {"a", "b", "c", "d"};
        String[] stringarr2 = {"e", "f", "g", "h"};
        List<String> list1 = new ArrayList<>(Arrays.asList(stringarr1));
        List<String> list2 = new ArrayList<>(Arrays.asList(stringarr2));
        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"},
                ListExamples.merge(list1, list2).toArray());
    }
    
    // The list filter returns is not in the order in which elements are found
    @Test
    public void testFilterList() {
        String[] strarr = new String[]{"apple", "pineapple", "orange",
                "aromatic", "experience"};
        List<String> list = new ArrayList<>(Arrays.asList(strarr));
        assertArrayEquals(new String[]{"apple", "pinapple", "application",
                "experience"},ListExamples.filter(list,new Check()).toArray());
    }

    public class Check implements StringChecker {
        @Override
        public boolean checkString(String s) {
            return s.contains("p");
        }
    }
}