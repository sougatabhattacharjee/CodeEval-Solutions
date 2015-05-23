package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComparePoints {

	/**
	 * @param O
	 * https://www.codeeval.com/open_challenges/192/
	 */

	public static String swap(int O, int P, int Q, int R)
	{
        if(O==Q && P==R)
            return "here";
        if(O==Q){
            if(P<R)
                return "N";
            else
                return "S";
        }
        if(P==R){
            if(O<Q)
                return "E";
            else
                return "W";
        }

        if(O<Q && P<R)
            return "NE";
        if(O>Q && P>R)
            return "SW";
        if(O>Q && P<R)
            return "NW";
        if(O<Q && P>R)
            return "SE";

        return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

                int O, P, Q, R;

                O = Integer.parseInt(sCurrentLine.trim().split(" ")[0]);
                P = Integer.parseInt(sCurrentLine.trim().split(" ")[1]);
                Q = Integer.parseInt(sCurrentLine.trim().split(" ")[2]);
                R = Integer.parseInt(sCurrentLine.trim().split(" ")[3]);

                System.out.println(swap(O, P, Q, R));


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
