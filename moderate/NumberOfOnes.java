package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NumberOfOnes {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/16/
	 */
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;

				int num = Integer.parseInt(sCurrentLine.trim());
				int i = num;
				int count = 1;
				
				
				while(i>1)
				{
					if(num%2==0)
					{
						num = num / 2;
						i = num;
					}
					else
					{
						count ++;
						num = num / 2;
						i = num;
					}
				}
				
				
				
				System.out.println(i==0?"0":count);
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
