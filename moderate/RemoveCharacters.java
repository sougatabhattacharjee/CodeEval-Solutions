package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class RemoveCharacters {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/124/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			int[] num = null;
			int value = 0;
			String result = "";
			
			
			br = new BufferedReader(new FileReader(args[0]));
			StringBuilder as = new StringBuilder();
			String r = "";
			
			
			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				String c = "";
				ch = sCurrentLine.trim().split(",");
				as = new StringBuilder(ch[0]);
				
				for(int i=0;i<ch[0].length();i++)
				{
					c = "" + ch[0].charAt(i);
					if(!ch[1].contains(c) || c.equals(" "))
					result += c; 
				}
				
				
				
				System.out.println(result);
				
//				
					
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
