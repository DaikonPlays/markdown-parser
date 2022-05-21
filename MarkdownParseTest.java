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
    @Test
    public void testSnippet1() throws IOException {
        Path file = Path.of("snippet1.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);       
        List<String> expectedLinks = List.of("`google.com","google.com","ucsd.edu");
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
    }
    @Test
    public void testSnippet2() throws IOException {
        Path file = Path.of("snippet2.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);       
        List<String> expectedLinks = List.of("a.com","a.com(())","example.com");
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
    }
    @Test
    public void testSnippet3() throws IOException {
        Path file = Path.of("snippet3.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);       
        List<String> expectedLinks = List.of("https://www.twitter.com",
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
        "https://cse.ucsd.edu/");
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
        assertArrayEquals(expectedLinks.toArray(), links.toArray());
    }
}