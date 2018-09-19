import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class addMethod {

//    String path = "/Users/maksim/IdeaProjects/addingAMethodFromTheConsole/src/Monkey.java";
//
//    String text = "Hello world!\n";

    public static void removeLines(String path, String text) throws IOException {


        try {
            RandomAccessFile raf = new RandomAccessFile(path, "rw");
            long length = raf.length();
            //System.out.println("File Length="+raf.length());
            raf.setLength(length - 2);
            //System.out.println("File Length="+raf.length());
            raf.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }


    }


    }


