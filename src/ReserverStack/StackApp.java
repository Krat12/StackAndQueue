package ReserverStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackApp {

    public static void main(String[] args) throws IOException {
        String input, output;

        while (true) {
            input = getString();
            if(input.equals("")){
                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.doRev();
            System.out.println(output);
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
