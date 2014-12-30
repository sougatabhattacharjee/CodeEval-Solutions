package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NModM {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/62/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			int n=0,m=0;
			br = new BufferedReader(new FileReader(args[0]));
			
			

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				
				ch = sCurrentLine.split(",");
				n=Integer.parseInt(ch[0]);
				m=Integer.parseInt(ch[1]);
				
				System.out.println(n%m);
				
				
				
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
