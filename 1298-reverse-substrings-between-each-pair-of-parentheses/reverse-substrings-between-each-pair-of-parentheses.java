class Solution {
    public String reverseParentheses(String s) {
        // https://www.youtube.com/watch?v=w0qwmjVLGUg&t=12s
        // Add the String to a Stack char by char,
        // Whenever we see ')' then start pop operation on Stack and it in a Queue till we find '('
        // Then pop the '(' as well from Stack
        // Now the string in the Queue remove it one by one and push to the Stack again till it's empty
        // Finally we will have the result in Stack, 
        // so take it out in a StringBuilder and reverse and convert into String for the final answer
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                Queue<Character> charQueue = new LinkedList<>();
                while (charStack.peek() != '(') {
                    charQueue.add(charStack.pop());
                }
                charStack.pop();
                while (!charQueue.isEmpty()) {
                    charStack.push(charQueue.remove());
                }
            } else {
                charStack.push(c);
            }
        }
        StringBuilder answer = new StringBuilder();
        while (!charStack.isEmpty()) {
            answer.append(charStack.pop());
        }
        return answer.reverse().toString();
    }
}