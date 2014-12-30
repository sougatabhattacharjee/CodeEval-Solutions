package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadMore {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/167/
	 */
	public static boolean containsWhiteSpace(final String testCode){
	    if(testCode != null){
	        for(int i = 0; i < testCode.length(); i++){
	            if(Character.isWhitespace(testCode.charAt(i))){
	                return true;
	            }
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch,result = "" ;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim();
				char[] charArray = ch.toCharArray();

				if(charArray.length<=55)
					System.out.println(charArray);
				else
				{
					for(int i=0;i<40;i++)

						result +=charArray[i]+"";

					result = containsWhiteSpace(result)?result.substring(0, result.lastIndexOf(" ")):result;
					System.out.println(result+"... <Read More>");
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
