import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReverseAdd {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/45/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int input = 0;
			int i=0;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()>0)
				{
					input = Integer.parseInt(sCurrentLine);

					for(i=0;;i++)
					{
						if(!palindrome(input))
						{

							input = input + reverse(input);

						}
						else
							break;
					}
					System.out.println(i+" "+input);

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



	private static boolean palindrome(int input) {
		int n = input;
		int rev = 0,dig=0;
		while (input > 0)
		{
			dig = input % 10;
			rev = rev * 10 + dig;
			input = input / 10;
		}

		if(n == rev)		 
			return true;
		else
			return false;
	}



	private static int reverse(int input) {
		int  reverse = 0;
		while(input != 0 )
		{
			reverse = reverse * 10;
			reverse = reverse + input%10;
			input = input/10;
		}
		return reverse;
	}

}
