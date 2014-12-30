import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RomanArabic {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/150/
	 */

	public enum roman{
		I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

		private final int enumValue;

		private roman(int enumValue) {
			this.enumValue = enumValue;
		}

		public int enumValueAsInt() {
			return enumValue;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				int total = 0;

				char[] charArray = sCurrentLine.trim().toCharArray();

				for(int i=0; i<charArray.length;i=i+2)
				{
					if(i+3>charArray.length)
						total += Integer.parseInt(charArray[i]+"")*roman.valueOf(charArray[i+1]+"").enumValueAsInt();
					else
					{
						if(roman.valueOf(charArray[i+1]+"").enumValueAsInt()>=roman.valueOf(charArray[i+3]+"").enumValueAsInt())
							total += Integer.parseInt(charArray[i]+"")*roman.valueOf(charArray[i+1]+"").enumValueAsInt();
						else
							total -= Integer.parseInt(charArray[i]+"")*roman.valueOf(charArray[i+1]+"").enumValueAsInt();
					}
				}

				System.out.println(total);

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
