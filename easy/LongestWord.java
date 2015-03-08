package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LongestWord {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/111/
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				String max = "";
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split(" ");

				max = ch[0];
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i].trim().length()>max.trim().length())
						max = ch[i].trim();
				}

				System.out.println(max);
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
