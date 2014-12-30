package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lowercase {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/20/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String result = "";

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.split(" ");	
				
				result = "";
				for(String ele:str)
					result = result + " " +ele.toLowerCase();


				System.out.println(result.trim());

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
