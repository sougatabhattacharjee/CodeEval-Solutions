package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class ReverseWords {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/8/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String result = "";

			java.util.Stack<String> stk = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.split(" ");	
				stk = new Stack<String>();

				for(String ele:str)
					stk.push(ele.trim());
				
				result = "";
				for(int i=0;i<str.length;i++)
					result = result + " " +stk.pop().trim();
				
				System.out.println(result.trim());

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
