import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
https://www.codeeval.com/open_challenges/110/
*/


public class TextToNumber {

	/**
	 * @param args
	 */
	
	public static int numbers(String ch)
	{
		switch (ch) {
		case "zero": return 0;
		case "one": return 1;
		case "two": return 2;
		case "three": return 3;
		case "four": return 4;
		case "five": return 5;
		case "six": return 6;
		case "seven": return 7;
		case "eight": return 8;
		case "nine": return 9;
		case "ten": return 10;
		case "eleven": return 11;
		case "twelve": return 12;
		case "thirteen": return 13;
		case "fourteen": return 14;
		case "fifteen": return 15;
		case "sixteen": return 16;
		case "seventeen": return 17;
		case "eighteen": return 18;
		case "nineteen": return 19;
		case "twenty": return 20;
		case "thirty": return 30;
		case "forty": return 40;
		case "fifty": return 50;
		case "sixty": return 60;
		case "seventy": return 70;
		case "eighty": return 80;
		case "ninety": return 90;
		case "hundred": return 100;
		case "thousand": return 1000;
		case "million": return 1000000;
		
		default:
			break;
		}
		
		return 0;
	}
	
	
	public static int millions_to_number(String text)
	{
		int result = 0;
		String[] split;
		split = text.split("million");
		for(String m : split)
			result += thousands_to_number(m) * numbers("million");
		return result + thousands_to_number(split[-1]);
	}
	public static int thousands_to_number(String text)
	{
		int result = 0;
		String[] split;
		split = text.split("thousand");
		for(String m : split)
			result += hundreds_to_number(m) * numbers("thousand");
		return result + hundreds_to_number(split[-1]);
		
	}
	
	public static int hundreds_to_number(String text)
	{
		int result = 0;
		String[] split;
		split = text.split("hundred");
		for(String m : split)
			result += tens_to_number(m) * numbers("hundred");
		return result + tens_to_number(split[-1]);
	
			
	}
	
	public static int tens_to_number(String text)
	{
		if(text.length()==0)
			return 0;
		
		int result = 0;
		String[] split;
		split = text.split(" ");
		for(String m : split)
			result += numbers(m);
		return result ;
	
			
	}
	
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
int result = 0;int mul = 0;int sum = 0;

				if(sCurrentLine.length()<=0)
					continue;
				
				str = sCurrentLine.trim().split(" ");
				
				sCurrentLine = sCurrentLine.replaceAll("negative ", "");
				
				result = millions_to_number(sCurrentLine.trim());
				
//				for(int i=0;i<str.length;i++)
//				{
//					if(str[i].equals("negative"))
//						continue;
//					else
//					{
//						if(str[i].equals("million"))
//						{
//							 mul = result * numbers(str[i]);
//							 result = mul;
//						}
//						
//						else if(str[i].equals("hundred") || str[i].equals("thousand"))
//						{
//							 mul = result * numbers(str[i]);
//							 result = result + mul -numbers(str[i-1]);
//						} 
//						
//						else if(str[i].equals("twenty") || str[i].equals("thirty") || str[i].equals("forty") ||
//								str[i].equals("fifty") || str[i].equals("sixty") || str[i].equals("seventy") ||
//								str[i].equals("eighty") || str[i].equals("ninety"))
//						{
//							sum = numbers(str[i]);
//							
//							result = result + sum;
//							//i++;
//						}
//						
//						else if(str.length==1)
//						{
//							result = result + numbers(str[i]);
//							break;
//						}
//						
//						else 
//							result = result + numbers(str[i]);
//							
//					}
//					
//				}
				
			
				System.out.println(str[0].equals("negative")?"-"+result:result);
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
