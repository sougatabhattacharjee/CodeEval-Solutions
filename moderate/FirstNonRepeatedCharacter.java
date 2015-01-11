package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FirstNonRepeatedCharacter {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/12/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String result = "";
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				
				if(sCurrentLine.length()==0)
					continue;

				for(int i=0;i<sCurrentLine.length();i++)
				{
					for(int j=0;j<sCurrentLine.length();j++)
					{
						if(i!=j)
						{
							if(sCurrentLine.charAt(i)!=sCurrentLine.charAt(j))
							{
								result = sCurrentLine.charAt(i)+"";
								
							}
							else
							{
								result = "";
								break;
							}
						}
					}
					
					if(result.length()>0) break;
				}

				System.out.println(result);

			}

		}catch (IOException e) {
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
