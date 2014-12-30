package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NiceAngles {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/160/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String left="",min="",sec="";
		double num = 0.0, tmp = 0.0;
		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				String result = new String();
				if(sCurrentLine.length()<=0)
					continue;

				num = Double.valueOf(sCurrentLine.trim());
				left = String.valueOf((int)num);

				min = String.valueOf((int)((num - (int)num)*60));

				tmp = (num - (int)num)*60;
				sec = String.valueOf((int)((tmp - (int)tmp)*60));

				//left = left.length()>1?left:"0"+left;
				min = min.length()>1?min:"0"+min;
				sec = sec.length()>1?sec:"0"+sec;

				result = left +"."+ min  +"'"+ sec + "\"";


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
