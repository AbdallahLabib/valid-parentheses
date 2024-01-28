import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            if (c == ')')
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;

            if (c == '}')
                if (!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;

            if (c == ']')
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.isEmpty() ? true : false;
    }
}
