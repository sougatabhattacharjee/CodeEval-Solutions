package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumofIntegersfromFile {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/24/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int str = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = str + Integer.parseInt(sCurrentLine.trim());
			}
			System.out.println(str);
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