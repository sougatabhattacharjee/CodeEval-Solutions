package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LowestUniqueNumber {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/100/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			boolean r = false;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				int min = 0;
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split(" ");

				for(int i=0;i<ch.length;i++)
				{
					for(int j=0;j<ch.length;j++)
					{
						if(i==j)
							continue;
						if(Integer.parseInt(ch[i])==Integer.parseInt(ch[j]))
						{
							r = false;
							break;
						}
							
						else
						{
							r = true;
							
						}

					}
					if(r && (min>Integer.parseInt(ch[i])||min==0))
						min = Integer.parseInt(ch[i]);


				}

//				System.out.println(min);
				
				if(min>0)
				{
				for (int i = 0; i < ch.length; i++) {
					  if (Integer.parseInt(ch[i]) == min) {
					    System.out.println(i+1);
					    break;
					  }
					}
				}
				else
				    System.out.println("0");
				//System.out.println(Arrays.asList(ch).indexOf(min));
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
