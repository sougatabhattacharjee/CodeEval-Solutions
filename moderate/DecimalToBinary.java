import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DecimalToBinary {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/27/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.length()==0)
					continue;
				
				System.out.println(Integer.toBinaryString(Integer.parseInt(sCurrentLine.trim())));

			}

		}catch (IOException e) {
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
