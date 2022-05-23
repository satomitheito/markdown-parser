// Imports the assert comparison code 
//which returns a boolean comparing the left and right inputs
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class MarkdownParseTest {
    static ArrayList<String> test; 

    @Before 
    public void setUp() {
        test = new ArrayList<String>();
        test.add("https://something.com");
        test.add ("some-thing.html");
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinkstest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

    }

    // @Test
    // public void getLinkstestSOne() throws IOException{
    //     Path fileName = Path.of("snippet1.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     result.add("`google.com");
    //     result.add("google.com");
    //     result.add("ucsd.edu");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void getLinksSOne() throws IOException{
    //     Path fileName = Path.of("snippet1.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     // result.add("`google.com");
    //     // result.add("google.com");
    //     // result.add("ucsd.edu");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void gettestSOne() throws IOException{
    //     Path fileName = "snippet1.md";
    //     File file = new File(fileName);
    //     Scanner myReader = new Scanner(file);
    //     //String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(myReader);
    //     ArrayList<String> result = new ArrayList<String>();
    //     // result.add("`google.com");
    //     // result.add("google.com");
    //     // result.add("ucsd.edu");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void getLinkstestSTwo() throws IOException{
    //     Path fileName = Path.of("snippet2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     result.add("a.com");
    //     result.add("a.com(())");
    //     result.add("example.com");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void getLinksSTwo() throws IOException{
    //     Path fileName = Path.of("snippet2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     // result.add("a.com");
    //     // result.add("a.com(())");
    //     // result.add("example.com");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void getLinkstestSThree() throws IOException{
    //     Path fileName = Path.of("snippet3.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    //     assertEquals(result, links);
    // }

    // @Test
    // public void getLinksSThree() throws IOException{
    //     Path fileName = Path.of("snippet3.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     //result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    //     assertEquals(result, links);
    // }
}

