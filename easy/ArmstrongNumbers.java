package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ArmstrongNumbers {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/82/
	 */
	public static String armstrong(String n)
	{
		int result = 0;
		for(int i = 0;i<n.length();i++)
		{
			result = (int) (result + Math.pow(Integer.parseInt(n.charAt(i)+""),n.length()));
		}

		if(result == Integer.parseInt(n))		
			return "True";
		else
			return "False";
	}


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

				
				System.out.println(armstrong(ch));
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
