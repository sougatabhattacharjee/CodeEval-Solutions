import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;



public class ValidParentheses {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/68/
	 */


	public static boolean isParanthesisValid(String s) {
		HashMap<Character, Character> paranthesis = new HashMap<Character, Character>();
		paranthesis.put('(', ')');
		paranthesis.put('{', '}');
		paranthesis.put('[', ']');
		

		java.util.Stack<Character> stackCharacter = new java.util.Stack<Character>();


		if(s.length()%2!=0)
			return false;

		for (int i = 0; i < s.length(); i++) {
			char currentCh = s.charAt(i);


			if (paranthesis.keySet().contains(currentCh)) {
				stackCharacter.push(currentCh);
			} else if (!stackCharacter.empty() && paranthesis.values().contains(currentCh)) {
//				if(stackCharacter.empty())
//					return false;
				char peek = stackCharacter.peek();
				char peekValue = paranthesis.get(peek);
				if (!stackCharacter.empty() && peekValue == currentCh) {
					stackCharacter.pop();
					
				} else {
					return false;
				}
			}
			else
				return false;
		}

		return stackCharacter.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()==0)
					continue;




				System.out.println(isParanthesisValid(sCurrentLine.trim())?"True":"False");




			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
