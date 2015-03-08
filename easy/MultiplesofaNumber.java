package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MultiplesofaNumber {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/18/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int result = 0;
			String[] num = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()==0)
					continue;
					
				
				num = sCurrentLine.split(",");
				result = 0;
				result = result + Integer.parseInt(num[1]);
				while(result<Integer.parseInt(num[0]))
					result = result + Integer.parseInt(num[1]);
				
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
