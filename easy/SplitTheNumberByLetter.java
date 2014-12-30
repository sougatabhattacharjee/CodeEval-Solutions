package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SplitTheNumberByLetter {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/131/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String left = "";
			String right = "";
			int pos = 0;
			int l=0,r=0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.split(" ");

				left = str[0];
				right = str[1];


				pos = right.contains("+")?right.indexOf("+"):right.indexOf("-");

				l = Integer.parseInt(left.substring(0, pos));
				r = Integer.parseInt(left.substring(pos));

				//System.out.println(l+":"+r);
				if(right.charAt(pos)=='+')
					System.out.println(l+r);
				else
					System.out.println(l-r);

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
