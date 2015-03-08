package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SwapCase {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/96/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			char ch ;
			br = new BufferedReader(new FileReader(args[0]));
			
			StringBuilder myName = null; 

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				myName = new StringBuilder(sCurrentLine);
				
				for(int i=0;i<myName.length();i++)
				{
					
					
					if(sCurrentLine.charAt(i)>='A' && sCurrentLine.charAt(i)<='Z')
					{
						ch = Character.toLowerCase(sCurrentLine.charAt(i));
						myName.setCharAt(i, ch);
						
					}
					else if(sCurrentLine.charAt(i)>='a' && sCurrentLine.charAt(i)<='z')
					{
						ch = Character.toUpperCase(sCurrentLine.charAt(i));
						myName.setCharAt(i, ch);
					}
					
						
				}
				
				System.out.println(myName);
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
