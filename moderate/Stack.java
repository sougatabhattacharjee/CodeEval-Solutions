import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Stack {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/9/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int input = 0;
			String[] str = null;
			
			java.util.Stack<Integer> stk = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				String result = "";
				stk = new java.util.Stack<Integer>();
				if(sCurrentLine.length()>0)
				{
					str = sCurrentLine.split(" ");
					
					for(int i = 0;i<str.length;i++)
						stk.push(Integer.parseInt(str[i]));
					
					for(int i = 0;i<str.length;i++)
					{	input =stk.pop();
					if(i%2==0)
						result = result + String.valueOf(input)+" ";
					}
					
					
					System.out.println(result.trim());
					

				}
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
