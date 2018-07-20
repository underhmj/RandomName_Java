package RandomNameLogic.UnitTests;

import RandomNameLogic.*;
import junit.framework.TestCase;

import java.io.IOException;

public class FileLoaderTest extends TestCase {

    FileLoader testFileLoader;

    public void setUp() throws Exception
    {
        super.setUp();
        testFileLoader = new FileLoader();
    }

    public void tearDown() throws Exception
    {
       testFileLoader = null;
    }

    public void testGetLoadedFile() throws IOException
    {
        testFileLoader.LoadFile("adjectives.txt");
        assertTrue(!testFileLoader.getLoadedFile().get(3).equals(""));
    }

    public void testLoadFile() throws IOException
    {
        testFileLoader.LoadFile("adjectives.txt");
        assertTrue(!testFileLoader.getLoadedFile().get(0).equals(""));
        assertTrue(testFileLoader.getLoadedFile().size() > 0);
    }
}