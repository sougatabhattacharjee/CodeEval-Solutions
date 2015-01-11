package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PredictTheNumber {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/125/
	 */

	
	public static String buildString(String st, int pos)
	{
		
		StringBuilder stb = new StringBuilder(st);
		
		//System.out.println(stb);
		
		String tmp = stb.toString();
		
		while(pos>=stb.length())
		{
			for(int i=0;i<stb.length();i++)
			{
				if(stb.charAt(i)=='0')
				{
					stb.replace(i, i+1, "1");
					continue;
				}
				if(stb.charAt(i)=='1')
				{
					stb.replace(i, i+1, "2");
					continue;
				}
				if(stb.charAt(i)=='2')
				{
					stb.replace(i, i+1, "0");
					continue;
				}
			}
			
			tmp+=stb.toString();
			stb = new StringBuilder(tmp);
			
			
		}
		
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			
			
			int position = 0;

			String result = "0";
			
			int count = 0;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

//				StringBuilder stb = new StringBuilder();
//				
//				stb.append("0");
//				
//				int position = 0;
//
//				String result = "";
//				
//				position = Integer.parseInt(sCurrentLine.trim());
//
//				result = buildString(stb, position);
				
				
				position = Integer.parseInt(sCurrentLine.trim());

				if(position==0)
				{
					System.out.println("0");
					continue;
				}
				if(position==1 || position ==2)
				{
					System.out.println("1");
					continue;
				}
				
				result = buildString(result, position);
//				if (count == 0)
//					result = buildString(result, position);
//				else
//					result += buildString(result, position); 
//				
//				count ++;
				
				//stb.append(result);
				
				//System.out.println(stb);
				
				System.out.println(result.charAt(position));

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
