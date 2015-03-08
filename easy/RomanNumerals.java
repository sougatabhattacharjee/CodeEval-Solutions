package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RomanNumerals {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/19/
	 */


	private static String[] roman(int n) {

		String[] str = new String[2];
		
		if(n==4){
			str[0] = "IV";
			str[1] = String.valueOf(n - 4);
			return str;
		}
		
		if(n==9)
		{
			str[0] = "IX";
			str[1] = String.valueOf(n - 9);
			return str;
		}
		if(n>=1 && n<4)
		{
			str[0] = "I";
			str[1] = String.valueOf(n - 1);
			return str;
		}

		if(n>=5 && n<9)
		{
			str[0] = "V";
			str[1] = String.valueOf(n - 5);
			return str;
		}

		if(n>=10 && n<40)
		{
			str[0] = "X";
			str[1] = String.valueOf(n - 10);
			return str;
		}
		if(n>=40 && n<50)
		{
			str[0] = "XL";
			str[1] = String.valueOf(n - 40);
			return str;
		}
		if(n>=50 && n<90)
		{
			str[0] = "L";
			str[1] = String.valueOf(n - 50);
			return str;
		}
		if(n>=90 && n<100)
		{
			str[0] = "XC";
			str[1] = String.valueOf(n - 90);
			return str;
		}
		if(n>=100 && n<400)
		{
			str[0] = "C";
			str[1] = String.valueOf(n - 100);
			return str;
		}
		if(n>=400 && n<500)
		{
			str[0] = "CD";
			str[1] = String.valueOf(n - 400);
			return str;
		}
		if(n>=500 && n<900)
		{
			str[0] = "D";
			str[1] = String.valueOf(n - 500);
			return str;
		}
		if(n>=900 && n<1000)
		{
			str[0] = "CM";
			str[1] = String.valueOf(n - 900);
			return str;
		}
		if(n>=1000)
		{
			str[0] = "M";
			str[1] = String.valueOf(n - 1000);
			return str;
		}


		/*switch (n) {
		case 1: return "I";
		case 4: return "IV";
		case 5: return "V";
		case 9: return "IX";
		case 10: return "X";
		case 50: return "L";
		case 100: return "C";
		case 500: return "D";
		case 1000: return "M";
		default:
			break;
		}

		 */
		return null;	

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int num = 0;
			String result = "";

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				String[] str = null;
				if(sCurrentLine.length()<=0)
					continue;

				num = Integer.parseInt(sCurrentLine.trim());

				while(num>0)
				{
					str =  roman(num);
					result = result + str[0];
					num = Integer.parseInt(str[1]);
					
				}
				
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
