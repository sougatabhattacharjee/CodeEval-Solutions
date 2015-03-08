package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class RoadTrip {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/124/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			int[] num = null;
			int value = 0;
			String result = "";
			
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				int count = 0;
				result = "";
				ch = sCurrentLine.trim().split(";");
				
				num = new int[ch.length];
				value = 0;
				for(String ele: ch)
				{
					num[value] = Integer.parseInt(ele.substring(ele.lastIndexOf(",")+1));
					value++;
				}
				
				Arrays.sort(num);
				
				for(int e:num)
				{
					count = e - count;
					result = result+count+",";
				}
				
				
				
				System.out.println(result.substring(0, result.length()-1));
				
				
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
