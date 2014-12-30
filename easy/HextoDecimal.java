package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HextoDecimal {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/149/
	 */
	

	public static long integerfrmbinary(String str){
		double j=0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'A' || str.charAt(i) == 'a'){
				j=j+ 10*Math.pow(16,str.length()-1-i);
				continue;
			}
			if(str.charAt(i) == 'B' || str.charAt(i) == 'b'){
				j=j+ 11*Math.pow(16,str.length()-1-i);
				continue;
			}
			if(str.charAt(i) == 'C' || str.charAt(i) == 'c'){
				j=j+ 12*Math.pow(16,str.length()-1-i);
				continue;
			}
			if(str.charAt(i) == 'D' || str.charAt(i) == 'd'){
				j=j+ 13*Math.pow(16,str.length()-1-i);
				continue;
			}
			if(str.charAt(i) == 'E' || str.charAt(i) == 'e'){
				j=j+ 14*Math.pow(16,str.length()-1-i);
				continue;
			}
			if(str.charAt(i) == 'F' || str.charAt(i) == 'f'){
				j=j+ 15*Math.pow(16,str.length()-1-i);
				continue;
			}
			else{
				j=j+ Integer.parseInt(str.charAt(i)+"")*Math.pow(16,str.length()-1-i);
				continue;
			}
		}
		return (long) j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				System.out.println(integerfrmbinary(sCurrentLine.trim()));

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
