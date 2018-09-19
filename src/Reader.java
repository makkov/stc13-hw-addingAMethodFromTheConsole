import java.util.Scanner;

public class Reader {

    public static String readFromTheConsole() {
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String temp;
        while ((temp = scanner.nextLine()).length() != 0){
            text.append(temp + "\n");
        }
        return ("\n" + text.toString() + "\n" + "}" + "\n");
    }
}
