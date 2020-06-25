import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] arg) throws FileNotFoundException {

        String[] args = {"test.txt"};
        App app = new App(args);
        app.startProgram();

    }
}
