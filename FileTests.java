import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class FileTests {
    @Test
    public void testGetFiles1() throws IOException {
        List<File> files = FileExample.getFiles(new File("F:\\CSE12\\lab3\\some-files"));
        File[] expected = new File[] {
            new File("F:\\CSE12\\lab3\\some-files\\a.txt"), 
            new File("F:\\CSE12\\lab3\\some-files\\more-files\\b.txt"), 
            new File("F:\\CSE12\\lab3\\some-files\\more-files\\c.java"),
            new File("F:\\CSE12\\lab3\\some-files\\even-more-files\\d.java"),
            new File("F:\\CSE12\\lab3\\some-files\\even-more-files\\a.txt")
        };
        assertArrayEquals(expected, files.toArray());
    }

    @Test
    public void testGetFiles2() throws IOException {
        List<File> files = FileExample.getFiles(new File("F:\\CSE12\\lab3\\some-files\\more-files"));
        File[] expected = new File[] {
            new File("F:\\CSE12\\lab3\\some-files\\more-files\\b.txt"),
            new File("F:\\CSE12\\lab3\\some-files\\more-files\\c.java")
        };
        assertArrayEquals(expected, files.toArray());
    }

    @Test
    public void testGetFiles3() throws IOException {
        List<File> files = FileExample.getFiles(new File("F:\\CSE12\\lab3\\some-files\\a.txt"));
        File[] expected = new File[] {
            new File("F:\\CSE12\\lab3\\some-files\\a.txt"),
        };
        // assertEquals(new File("string"), new File("").getAbsolutePath());
        assertArrayEquals(expected, files.toArray());
    }
}
