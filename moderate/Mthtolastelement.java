import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Mthtolastelement {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/10/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] res = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				res = sCurrentLine.split(" ");
				
				if(res.length>0)
				{
				
				if(res.length-1>=Integer.parseInt(res[res.length-1]))
					System.out.println(res[(res.length-Integer.parseInt(res[res.length-1])-1)]);
				
				else

					System.out.println(" ");
				
				}
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
