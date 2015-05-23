package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SwapNumbers {

	/**
	 * @param s
	 * https://www.codeeval.com/open_challenges/196/
	 */



	public static String swap(String s)
	{
        String originalString = s;

        char[] c = originalString.toCharArray();

        char temp = c[0];
        c[0] = c[c.length-1];
        c[c.length-1] = temp;

        String swappedString = new String(c);

        return swappedString;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

                String[] st = sCurrentLine.trim().split(" ");

                for(int i = 0;i<st.length; i++){

                    System.out.print(swap(st[i])+" ");
            }

                System.out.println();
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
