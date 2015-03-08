package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FindWriter {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/97/
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			String[] num = null;
			
			String result = "";


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split("\\|");
				num = ch[1].trim().split(" ");
				result = "";
				for(String ele:num)
				{
					result = result + ch[0].charAt(Integer.parseInt(ele)-1);
				}
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
