import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		   if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack, top);
    }

    private static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        sortedInsert(stack, element);
        stack.push(top);
    }
	}