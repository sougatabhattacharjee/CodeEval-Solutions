package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringMask {

	/**
	 * https://www.codeeval.com/open_challenges/199/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch = null ;


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;

				String word = sCurrentLine.trim().split(" ")[0];
				String numbers = sCurrentLine.trim().split(" ")[1];
				StringBuilder sb = new StringBuilder();

				for(int i=0;i<word.length();i++)
				{
					if(numbers.charAt(i)=='1')
						sb.append(Character.toUpperCase(word.charAt(i)));
					else
						sb.append(word.charAt(i));
				}
				System.out.println(sb.toString());
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
