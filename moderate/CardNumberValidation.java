package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CardNumberValidation {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/172/
	 */
	
	public static int sumGreaterthan10(int i)
	{
		return i/10 + i%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch = null ;
			List<Integer> cardno = null;
			List<Integer> cardNoValidation;
			int sum = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				cardno = new ArrayList<Integer>();
				cardNoValidation = new ArrayList<Integer>();
				sum = 0;
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim();
				char[] charArray = ch.toCharArray();

				for(char c : charArray)
				{
					if (c != ' ')
					{
						cardno.add(Character.getNumericValue(c));
						
					}

				}
				

				for(int i=cardno.size()-1;i>=0;i--)
				{
					if(cardno.size()%2!=0)
					{
						if(i%2!=0)
							cardNoValidation.add(cardno.get(i)*2);
						else
							cardNoValidation.add(cardno.get(i));
					}
					else
					{
						if(i%2==0)
							cardNoValidation.add(cardno.get(i)*2);
						else
							cardNoValidation.add(cardno.get(i));
					}	
				}
				
				for(int i: cardNoValidation)
				{
					if(i>9)
						sum +=sumGreaterthan10(i);
					else
						sum +=i;
				}

				System.out.println(sum%10==0?1:0);

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
