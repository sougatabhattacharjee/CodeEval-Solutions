package hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringPermutation {

	/**
	 * @param args
	 */
	
	
	public static int Factorial(int n)
	{
		return n * Factorial(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String str[] = null;
			String sCurrentLine;

			StringBuffer result = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.trim().split("(?!^)");
				
				result = new StringBuffer();
				
				for(int i=0;i<Factorial(str.length);i++)
				{
					
				
				}

				String mynewstring = result.toString();
				mynewstring = mynewstring.substring(0, mynewstring.length()-1);
				System.out.println(mynewstring);



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
