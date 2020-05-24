import java.util.HashMap;
import java.util.Stack;


public class CheckParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[()]{}{[()()]()}";
		boolean braces=true;
		
		HashMap<Character, Character> map=new HashMap<Character, Character>();
		map.put('{','}');
		map.put('(',')');
		map.put('[',']');
		
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			Character curr=str.charAt(i);
			if(map.keySet().contains(curr))
			{
				stack.push(curr);		
			}else if(map.values().contains(curr))
			{
				if(!stack.empty() && map.get(stack.peek())==curr)
				{
					stack.pop();
				}
				else{
					braces= false;
				}
			}
			
		}stack.empty();
		
		System.out.println("========"+braces);

	}

}
