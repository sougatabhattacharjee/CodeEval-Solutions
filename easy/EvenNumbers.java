package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EvenNumbers {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/100/
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

				ch = sCurrentLine.trim();
				
				System.out.println(even(Integer.parseInt(ch)));
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

	private static int even(int parseInt) {
		// TODO Auto-generated method stub
		if(parseInt%2==0)
			return 1;
		else
			return 0;
			
			
	}

}
