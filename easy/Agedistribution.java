package easy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Agedistribution {
	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/152/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			String sCurrentLine;
			String ch = null ;
			br = new BufferedReader(new FileReader(args[0]));
			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.length()<=0)
					continue;
				ch = sCurrentLine.trim();
				System.out.println(age(Integer.parseInt(ch)));
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
	private static String age(int parseInt) {
		// TODO Auto-generated method stub
		if(parseInt>=0 && parseInt<=2)
			return "Still in Mama's arms";
		else if(parseInt==3 || parseInt==4)
			return "Preschool Maniac";
		else if(parseInt>=5 && parseInt<=11)
			return "Elementary school";
		else if(parseInt>=12 && parseInt<=14)
			return "Middle school";
		else if(parseInt>=15 && parseInt<=18)
			return "High school";
		else if(parseInt>=19 && parseInt<=22)
			return "College";
		else if(parseInt>=23 && parseInt<=65)
			return "Working for the man";
		else if(parseInt>=66 && parseInt<=100)
			return "The Golden Years";
		else if(parseInt>=23 && parseInt<=65)
			return "Working for the man";
		else
			return "This program is for humans";
	}
}