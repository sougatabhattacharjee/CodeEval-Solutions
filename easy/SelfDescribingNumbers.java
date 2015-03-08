package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
https://www.codeeval.com/open_challenges/40/
 */


public class SelfDescribingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			int count = 0;

			boolean flag = false;

			char pos ;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				count = 0;
				if(sCurrentLine.length()<=0)
					continue;

				for(int i = 0;i<sCurrentLine.length();i++)
				{
					count = 0;
					pos = sCurrentLine.charAt(i);

					for(int j = 0;j<sCurrentLine.length();j++)
					{
						if(sCurrentLine.charAt(j)==Character.forDigit(i, 10))
						{
							count++;
						}
					}
					
					if(pos==Character.forDigit(count, 10))
						flag = true;
					else
					{
						flag = false;
						break;
					}
						
				}

				System.out.println(flag?1:0);
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
