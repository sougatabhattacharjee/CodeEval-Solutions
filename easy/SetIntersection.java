package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SetIntersection {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/18/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String result = "";
			String[] num = null;
			String[] left = null;
			String[] right = null;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()==0)
					continue;
					result = "";
				num = sCurrentLine.split(";");
				
				left = num[0].split(",");
				right = num[1].split(",");
				
				//System.out.println(right.length);
				
				for(int i=0;i<left.length;i++)
				{
					for(int j=0;j<right.length;j++)
					{

						if(Integer.parseInt(left[i])<Integer.parseInt(right[j]))
							break;
						
						if(Integer.parseInt(left[i])==Integer.parseInt(right[j]))
							result = result+ left[i] + ",";
						
						
							
					}
				}
				
				if(result.length()>0)
					result = result.substring(0, result.length()-1);
								
				System.out.println(result);
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
