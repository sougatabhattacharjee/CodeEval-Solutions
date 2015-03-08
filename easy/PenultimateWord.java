package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PenultimateWord {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/96/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			br = new BufferedReader(new FileReader(args[0]));
			
			

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				ch = sCurrentLine.split(" ");
				
				System.out.println(ch[ch.length-2]);
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
