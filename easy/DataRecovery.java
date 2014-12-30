package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DataRecovery {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/140/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String[] num = null;
			String[] result = null;
			int missingNo = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()==0)
					continue;

				str = sCurrentLine.trim().split(";")[0].split(" ");
				num = new String[str.length];
				num = sCurrentLine.trim().split(";")[1].split(" ");

				missingNo = checkNumbers(str.length,num);
				
				result = new String[str.length];
				
				for(int i=0;i<num.length;i++)
				{
					
					result[Integer.parseInt(num[i])-1] = str[i];  
				}
				
				result[missingNo-1] = str[str.length-1];
				
			

				for(String ele:result)
				System.out.print(ele+" ");
				
				System.out.println();

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

	private static int checkNumbers(int length, String[] num) {
		boolean flag = false;
		int in = 0;
		if(length>num.length)
		{
			for(int i=1;i<=length;i++)
			{
				for(String ele:num)
				{
					if(ele.equalsIgnoreCase(String.valueOf(i)))
					{
						flag = true;
						break;
					}
					else
						flag = false;
				}

				if(!flag)
					in  = i;


			}
		}

		return in;
	}
}
