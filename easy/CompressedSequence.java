package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompressedSequence {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/128/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String result = "";


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				int count = 1;

				str = sCurrentLine.split(" ");	

				if(str.length==1)
					result = result + "1 "+str[0]+" ";

				else
				{
					for(int i=0;i<str.length;i++)
					{
						for(int j=i+1;j<str.length;)
						{
							if(str[i].equals(str[j]))
							{
								count ++;
								break;
							}
							else
							{
								result = result + count+" "+str[i]+" ";
								count = 1;
								break;
							}
						}
					}
					result = result + count+" "+str[str.length-1]+" ";
				}
				
				

				System.out.println(result.trim());

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
