package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MultiplyLists {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/113/
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			String[] l = null ;
			String[] r = null ;
			String res = "";
			br = new BufferedReader(new FileReader(args[0]));



			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split("\\|");
				l = ch[0].trim().split(" ");
				r = ch[1].trim().split(" ");
				
				res = "";
				for(int i=0;i<l.length;i++)
				{
					res = res+ Integer.parseInt(l[i])*Integer.parseInt(r[i]) + " ";
				}
				
				System.out.println(res.trim());

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
