import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * https://www.codeeval.com/open_challenges/32/
 */
public class TrailingString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		String sCurrentLine;
		String str[] = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.length()<=0)
					continue;

				str = sCurrentLine.trim().split(",");

				int diff = str[0].trim().length() - str[1].trim().length();
				if(diff<0)
				{
					System.out.println("0");
					continue;
				}
				else
				{
					String current = str[0].trim().substring(str[0].trim().length() - str[1].trim().length());
					if(current.equals(str[1].trim())) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				}


			}
		}


		catch (IOException e) {
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
