package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CleanUpTheWords {

	/**
	 * https://www.codeeval.com/open_challenges/205/
	 */

	public static boolean ifAscii(char c){
		if((c>=65 && c<=90) || (c>=97 && c<=122))
			return true;
		return false;
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

				String word = sCurrentLine.trim();
				StringBuilder sb = new StringBuilder(word.length());
				int count = 0;
				for(int i=0;i<word.length();i++)
				{
					if(ifAscii(word.charAt(i))) {
						count = 0;
						sb.append(Character.toLowerCase(word.charAt(i)));
					}
					else{
						count++;
						if(count==1 && sb.length()>0)
							sb.append(' ');
					}
				}
				System.out.println(sb.toString());
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
