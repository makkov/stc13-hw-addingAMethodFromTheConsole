import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "/Users/maksim/IdeaProjects/addingAMethodFromTheConsole/src/Monkey.java";
        String text = Reader.readFromTheConsole();
        Monkey monkey = new Monkey("Ivan", "ordinary", 10, 45, 39, false);

        //addMethod.removeLines(path, text);

        monkey.eat();//класс не скомпелирован заново, метод не работает

    }
}
