package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HiddenDigits {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/122/
	 */

	public static String hidden(String a)
	{
		switch (a) {
		case "a": return "0";
		case "b": return "1";
		case "c": return "2";
		case "d": return "3";
		case "e": return "4";
		case "f": return "5";
		case "g": return "6";
		case "h": return "7";
		case "i": return "8";
		case "j": return "9";
		default:
			break;
		}
		return null;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				String result = new String();
				if(sCurrentLine.length()<=0)
					continue;

				for(int i=0;i<sCurrentLine.length();i++)
				{
					if(sCurrentLine.charAt(i)>='a' && sCurrentLine.charAt(i)<='j')
						result = result + hidden(sCurrentLine.charAt(i)+"");
					else if(sCurrentLine.charAt(i)>='0' && sCurrentLine.charAt(i)<='9')
						result = result + sCurrentLine.charAt(i)+"";
					
				}
				
				
				
				
			System.out.println(result.trim().length()>0?result:"NONE");

			//System.out.println(result.trim().length());

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
