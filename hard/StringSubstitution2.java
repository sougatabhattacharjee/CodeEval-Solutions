import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringSubstitution2 {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/50/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			String str[] = null;

			String first = null;
			String second  = null;
			String[] repArray = null;
			String fi[]= null;
			String ri[]= null;
			int count = 0;
			int index = 0;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				int startIndex = 0, endIndex = 0;
				String firstSet = "";
				String secondSet = "";
				str = sCurrentLine.split(";");

				first = str[0].trim();
				second = str[1].trim();
				repArray = second.trim().split("\\,");
				count = 0;
				index = 0;
				fi = new String[repArray.length/2];
				ri = new String[repArray.length/2];
				
				for(int i=0,j=0;i<repArray.length;i=i+2,j++)
				{
					fi[j]=repArray[i];
					ri[j]=repArray[i+1];

				}

				for(int i=0;i<fi.length;i++)
				{
//					firstSet = first.substring(0, startIndex);
//					secondSet = first.substring(endIndex, first.length()-1);
					
				}
				
				
				firstSet = first.substring(0, 2);
				secondSet = first.substring(0, first.length());
				
				System.out.println(secondSet);

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

	public static int search(String first, String fi, String ri,int startIndex, int endIndex)
	{
		int j=0;


		for(int i = 0;i<(first.length()-fi.length())+1;i++)
		{

			if(first.charAt(i)==fi.charAt(j))
			{
				if (match(first,fi,i))
					return i;
			}


		}

		return 0;
	}

	public static boolean match(String first, String fi, int index)
	{
		int j=0;
		while(j<fi.length())
		{
			if (index >= first.length()) 
				return false;

			if(first.charAt(index)==fi.charAt(j))
			{
				index++;
				j++;
			}
			else
				return false;

		}
		return true;
	}


	private static String Substitution(String first, String fi, String ri,int start) {

		StringBuilder myName = new StringBuilder(first);

		myName.replace(start, start+fi.length(), ri+"");

		return myName.toString();
	}


}
