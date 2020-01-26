import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Path {

    static String locateUniverseFormula() {
        String filename = "universe-formula";
        String dir = "/tmp/documents";
        Stack<String> stack = new Stack<>();
        stack.push(dir);
        while (!stack.isEmpty()) {
            File file = new File(stack.pop());
            File[] listOfFiles = file.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile() && listOfFiles[i].getName().equals(filename)) {
                    return listOfFiles[i].getAbsolutePath();
                } else if (listOfFiles[i].isDirectory()) {
                    stack.push(listOfFiles[i].getAbsolutePath());
                }
            }
        }
        return null;
    }
}
