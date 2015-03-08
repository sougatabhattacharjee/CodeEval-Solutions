package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SlangFlavor {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/174/
	 */

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String[] slang = {", yeah!",", this is crazy, I tell ya.",", can U believe this?",", eh?",", aw yea.",", yo.","? No way!",". Awesome!"};
		
		try {

			String sCurrentLine;
			int counter = 0;
			int cnt = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;
				
				
				
				StringBuilder sb = new StringBuilder(sCurrentLine);
				
				for(int i=0;i<sb.length();i++)
				{
					if(sb.charAt(i)=='.' || sb.charAt(i)=='!' || sb.charAt(i)=='?')
					{
						counter++;
						if(counter%2==0)
						{
							if(cnt==slang.length)
								cnt = 0;
							sb.replace(i, i+1, slang[cnt]);
							i = i + slang[cnt].length();
							cnt++;
						}
					}
				}
				
				
				System.out.println(sb);
				
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
