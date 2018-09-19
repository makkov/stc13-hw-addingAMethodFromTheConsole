import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "/Users/maksim/IdeaProjects/addingAMethodFromTheConsole/src/Monkey.java";
        String text = Reader.readFromTheConsole();


        addMethod.removeLines(path, text);



        //monkey.eat("dsf", 3);
    }
}
