package baseball.commandline.scanner;


import java.util.Scanner;

public class InputScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.next();
    }
}
