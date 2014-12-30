package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RightmostChar {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/31/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			int result = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				
				str = sCurrentLine.split(",");
				
				result = 0;
				for(int i=0;i<str[0].length();i++)
				{
					if(String.valueOf(str[0].charAt(i)).equals(String.valueOf(str[1].charAt(0))))
						result = i;
				}
				
				if(result==0)
					result = -1;
				
				System.out.println(result);
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
