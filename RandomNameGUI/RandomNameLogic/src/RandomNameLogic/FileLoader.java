package RandomNameLogic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLoader
{
    private List<String> stringArray;

    public List<String> getLoadedFile()
    {
        return this.stringArray;
    }

    public void LoadFile(String path) throws IOException
    {
        String token;
        Scanner loadedFile = new Scanner(new File(path)).useDelimiter(",\\s*");
        stringArray = new ArrayList<>();

        while(loadedFile.hasNext())
        {
            token = loadedFile.next();
            stringArray.add(token);
        }
        loadedFile.close();
    }
}
