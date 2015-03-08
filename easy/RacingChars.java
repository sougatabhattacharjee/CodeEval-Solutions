package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RacingChars {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/136/
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
			String ch ;
			int prevPos = 0;
			int currentPos = 0;
			int count = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.length()<=0)
					continue;
				count++;
				ch = sCurrentLine.trim();
				if(count==1)
				{
					prevPos = ch.contains("C")?ch.indexOf("C"):ch.indexOf("_");
					StringBuilder stb = new StringBuilder(ch);
					stb.setCharAt(prevPos, '|');
					System.out.println(stb);
					continue;
				}
				
				if(count>1)
				{
					currentPos = ch.contains("C")?ch.indexOf("C"):ch.indexOf("_");
					StringBuilder stb = new StringBuilder(ch);
					if(currentPos<prevPos)
						stb.setCharAt(currentPos, '/');
					else if(currentPos>prevPos)
						stb.setCharAt(currentPos, '\\');
					else if(currentPos==prevPos)
						stb.setCharAt(currentPos, '|');
					
					prevPos = currentPos;
					System.out.println(stb);
					continue;
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
