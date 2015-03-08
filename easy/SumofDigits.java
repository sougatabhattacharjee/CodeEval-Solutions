package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumofDigits {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/21/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String str = null;
			int result = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				str = sCurrentLine;	
				result = 0;
				for(int i=0;i<str.length();i++)
					result = result + Integer.parseInt(str.charAt(i)+"");
				
				
				System.out.println(result);

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
