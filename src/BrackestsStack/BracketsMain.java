package BrackestsStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsMain {

    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        return line;
    }
}
