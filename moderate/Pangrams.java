import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Pangrams {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/37/
	 */


	public static int CharToASCII(final char character){
		return (int)character;
	}
	
	public static char ASCIIToChar(final int ascii){
		return (char)ascii;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			boolean flag = false;
			String result = "";
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				flag = false;
				result = "";
				for(int a=97;a<=122;a++)
				{

					for(int i=0;i<sCurrentLine.trim().length();i++)
					{

						if(CharToASCII(sCurrentLine.charAt(i))==a || CharToASCII(sCurrentLine.charAt(i))==a-32)
						{
							flag = true;
							break;
						}
						else
							flag = false;
					}
					
					if(!flag)
						result = result + ASCIIToChar(a);
				}
				
				System.out.println(result.length()==0?"NULL":result);
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
