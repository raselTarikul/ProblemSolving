import java.util.Stack;

public class Mock6 {

    public static void main(String[] args){

        String inp = "(}";

        Stack<Character> s = new Stack<>();

        for(Character c: inp.toCharArray()){
            if(c =='(' || c == '{' || c == '['){
                s.push(c);
            } else if(s.empty()){
                System.out.println("False");
                break;
            } else if(c == ')'){
                if(s.pop() != '('){
                    System.out.println("False");
                    break;
                }
            } else if(c == '}'){
                if(s.pop() != '{'){
                    System.out.println("False");
                    break;
                }
            } else {
                if(s.pop() != '['){
                    System.out.println("False");
                    break;
                }
            }
        }
        if(s.empty()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }



    }


}
