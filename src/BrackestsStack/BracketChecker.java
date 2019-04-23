package BrackestsStack;

public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check(){
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            switch (charAt){
                case '{':
                case '[':
                case '(':
                    stackX.push(charAt);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stackX.isEmpty()){
                        char nextChar = stackX.pop();
                        if((charAt == '}' && nextChar != '{') ||
                                (charAt == ']' && nextChar != '[') ||
                                (charAt == ')' && nextChar != '(')){

                            System.out.println("Error: "+charAt+" at "+i);

                        }
                    }else {
                        System.out.println("Error: "+charAt+" at "+i);
                    }
                    break;
                    default:break;
            }

        }
    }

}
