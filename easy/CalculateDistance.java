package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
https://www.codeeval.com/open_challenges/99/
*/


public class CalculateDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			
			String[] str = null;
			String[] left = null;
			String[] right = null;
			
			int result = 0;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				
				str = sCurrentLine.trim().split("\\)");
				
				left = str[0].trim().split(" ");
				
				right = str[1].trim().split(" ");
				
				left[0] = left[0].replaceAll("[\\(\\)+.^:,]","");
				left[1] = left[1].replaceAll("[\\(\\)+.^:,]","");
				right[0] = right[0].replaceAll("[\\(\\)+.^:,]","");
				right[1] = right[1].replaceAll("[\\(\\)+.^:,]","");
				
				result = (Integer.parseInt(left[0])-Integer.parseInt(right[0])) * (Integer.parseInt(left[0])-Integer.parseInt(right[0]))
						+ (Integer.parseInt(left[1])-Integer.parseInt(right[1])) * (Integer.parseInt(left[1])-Integer.parseInt(right[1]));
				
				
				
				
				System.out.println((int)(Math.sqrt(result)));
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
