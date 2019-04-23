package ReserverStack;

public class Reverser {

    private String input;

    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String doRev(){
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int i = 0; i <input.length() ; i++) {
            char charAt = input.charAt(i);
            stackX.push(charAt);
        }
        output ="";
        while (!stackX.isEmpty()){
            char charAt = stackX.pop();
            output = output + charAt;
        }
        return output;
    }
}
