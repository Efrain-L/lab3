import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTests {
    // Did not orignially print in order found
    @Test
    public void testFilter() {
        StringChecker strchk = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                return s.contains("p");
            }
        };
        List<String> strarr = new ArrayList<>(Arrays.asList(new String[]
                {"apple", "banana", "carrot", "pear"}));
        assertArrayEquals(new String[]{"apple", "pear"}, ListExamples.filter(strarr, strchk).toArray());
    }

    // Was geting stuck in an infinite loop
    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<>(Arrays.asList(new String[]
                {"a", "b", "c", "d"}));
        List<String> list2 = new ArrayList<>(Arrays.asList(new String[]
                {"e", "f", "g", "h"}));
        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"},
                ListExamples.merge(list1, list2).toArray());
    }
}
