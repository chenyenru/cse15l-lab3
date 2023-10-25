import java.io.File;
import java.io.IOException;

public class testFileExample {
    public static void main(String[] Args) throws IOException {
        System.out.println(FileExample.getFiles(new File("lib")));
    }
}
