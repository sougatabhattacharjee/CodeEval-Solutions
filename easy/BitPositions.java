package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BitPositions {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/19/
	 */
	

	private static boolean checkBitPositions(final int n, final int p1, final int p2) {
		int v = n << (32 - p1) >> 31;
		int z = n << (32 - p2) >> 31;
		return (v ^ z) == 0;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.trim().split(",");
				System.out.println(checkBitPositions(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])));
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
