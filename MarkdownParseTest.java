import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileTest() throws IOException {
        Path file = Path.of("test-file.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);       
        List<String> expectedLinks = List.of("https://something.com","some-thing.html");
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
    }
}