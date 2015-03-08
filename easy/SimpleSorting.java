package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SimpleSorting {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/91/
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			double[] dArr = null;
			int i = 0;
			String result = "";
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.split(" ");

				 
				dArr = new double[str.length];
				i = 0;
				result = "";
				
				
				for(String ele:str)
					dArr[i++] = Double.parseDouble(ele);
				
				Arrays.sort(dArr);
				
				
				
				for (int in = 0; in < dArr.length; in++) {
					System.out.format("%.3f", dArr[in]);
					if (in == dArr.length-1) {
					System.out.println();
					} else {
					System.out.print(" ");
					}
					}

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