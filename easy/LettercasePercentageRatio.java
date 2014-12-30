package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class LettercasePercentageRatio {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/147/
	 */

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			double total=0.00,lower=0.00,upper=0.00;
			
			DecimalFormat df = new DecimalFormat("0.00");
			

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				total=0.00;lower=0.00;upper=0.00;
				total = sCurrentLine.length();
				for(int i=0;i<sCurrentLine.length();i++)
				{
					if(sCurrentLine.charAt(i)>='A' && sCurrentLine.charAt(i)<='Z')
						upper = upper + 1;
					else if(sCurrentLine.charAt(i)>='a' && sCurrentLine.charAt(i)<='z')
						lower = lower + 1;
				}
				
				System.out.println("lowercase: "+df.format(((lower/total)*100))+" "+"uppercase: "+df.format(((upper/total)*100)));
				
				
				

				


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
