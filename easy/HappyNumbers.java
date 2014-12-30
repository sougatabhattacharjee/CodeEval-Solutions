package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class HappyNumbers {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/19/
	 */
	
	
	public static boolean isHappy(int i,ArrayList<Integer> checked) {
		
		int nextNum = 0;
	    if(i == 1)
	        return true;
	    
	    
	    String a = String.valueOf(i);
	    for(int n = 0;n<a.length();n++)
	    {
	    	nextNum = nextNum + Integer.parseInt(a.charAt(n)+"") * Integer.parseInt(a.charAt(n)+"");
	    }
	    
	    for(int j : checked)
	        if(nextNum == j)
	            return false;
	    checked.add(nextNum);
	    return isHappy(nextNum,checked);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			ArrayList<Integer> checked = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				checked = new ArrayList<Integer>();
				System.out.println(isHappy(Integer.parseInt(sCurrentLine.trim()),checked)?1:0);
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
