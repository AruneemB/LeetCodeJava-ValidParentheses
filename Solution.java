class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();
        for(char bracket : s.toCharArray())
        {
            if(bracket == '(') brackets.push(')');
            else if (bracket == '{') brackets.push('}');
            else if (bracket == '[') brackets.push(']');
            else if (brackets.isEmpty() || brackets.pop() != bracket)
			return false;
        }
        return brackets.isEmpty();
    }
}
