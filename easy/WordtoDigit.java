package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordtoDigit {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/131/
	 */
	
	public static String num(String a)
	{
		
		if(a.equalsIgnoreCase("zero"))
			return "0";
		if(a.equalsIgnoreCase("one"))
			return "1";
		if(a.equalsIgnoreCase("two"))
			return "2";
		if(a.equalsIgnoreCase("three"))
			return "3";
		if(a.equalsIgnoreCase("four"))
			return "4";
		if(a.equalsIgnoreCase("five"))
			return "5";
		if(a.equalsIgnoreCase("six"))
			return "6";
		if(a.equalsIgnoreCase("seven"))
			return "7";
		if(a.equalsIgnoreCase("eight"))
			return "8";
		if(a.equalsIgnoreCase("nine"))
			return "9";
		return "0";
		
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String result = "";
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				str = sCurrentLine.split(";");

				for(String ele:str)
					result = result + num(ele); 
					
				
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
