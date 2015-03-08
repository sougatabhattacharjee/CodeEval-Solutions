package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WithoutRepetitions {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/173/
	 */

	public static int sumGreaterthan10(int i)
	{
		return i/10 + i%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {


				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim();

				char[] charArray = ch.toCharArray();
				char[] tmp = new char[charArray.length];
				int j = 0;
				for(int i=0;i<charArray.length;i++)
				{
					if(i==0)
					{
						tmp[j] = charArray[i];
						j++;
					}
					else
					{
						if(charArray[i]!=charArray[i-1])
						{
							tmp[j] = charArray[i];
							j++;
						}
					}
				}

				for(int i=0;i<j;i++)
					System.out.print(tmp[i]);
					
				System.out.println();
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
