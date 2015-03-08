package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CapitalizeWords {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/93/
	 */


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				StringBuffer res = new StringBuffer();
				if(sCurrentLine.length()<=0)
					continue;

				str = sCurrentLine.trim().split(" ");
				
				for(String ele: str)
				{
					char[] string = ele.trim().toCharArray();
					
					string[0] = Character.toUpperCase(string[0]);
			        ele = new String(string);

			        res.append(ele).append(" ");
				}
				
				
				
				
				System.out.println(res.toString().trim());



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
