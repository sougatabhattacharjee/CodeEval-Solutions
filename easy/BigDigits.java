package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BigDigits {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/163/
	 */

	public static String getLine(int digits, int line)
	{
		String st = "";
		if(digits==0)
		{
			switch (line) {
			case 1: st = "-**--";
			break;
			case 2: st = "*--*-";
			break;
			case 3: st = "*--*-";
			break;
			case 4: st = "*--*-";
			break;
			case 5: st = "-**--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==1)
		{
			switch (line) {
			case 1: st = "--*--";
			break;
			case 2: st = "-**--";
			break;
			case 3: st = "--*--";
			break;
			case 4: st = "--*--";
			break;
			case 5: st = "-***-";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==2)
		{
			switch (line) {
			case 1: st = "***--";
			break;
			case 2: st = "---*-";
			break;
			case 3: st = "-**--";
			break;
			case 4: st = "*----";
			break;
			case 5: st = "****-";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==3)
		{
			switch (line) {
			case 1: st = "***--";
			break;
			case 2: st = "---*-";
			break;
			case 3: st = "-**--";
			break;
			case 4: st = "---*-";
			break;
			case 5: st = "***--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==4)
		{
			switch (line) {
			case 1: st = "-*---";
			break;
			case 2: st = "*--*-";
			break;
			case 3: st = "****-";
			break;
			case 4: st = "---*-";
			break;
			case 5: st = "---*-";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==5)
		{
			switch (line) {
			case 1: st = "****-";
			break;
			case 2: st = "*----";
			break;
			case 3: st = "***--";
			break;
			case 4: st = "---*-";
			break;
			case 5: st = "***--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==6)
		{
			switch (line) {
			case 1: st = "-**--";
			break;
			case 2: st = "*----";
			break;
			case 3: st = "***--";
			break;
			case 4: st = "*--*-";
			break;
			case 5: st = "-**--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==7)
		{
			switch (line) {
			case 1: st = "****-";
			break;
			case 2: st = "---*-";
			break;
			case 3: st = "--*--";
			break;
			case 4: st = "-*---";
			break;
			case 5: st = "-*---";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==8)
		{
			switch (line) {
			case 1: st = "-**--";
			break;
			case 2: st = "*--*-";
			break;
			case 3: st = "-**--";
			break;
			case 4: st = "*--*-";
			break;
			case 5: st = "-**--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		if(digits==9)
		{
			switch (line) {
			case 1: st = "-**--";
			break;
			case 2: st = "*--*-";
			break;
			case 3: st = "-***-";
			break;
			case 4: st = "---*-";
			break;
			case 5: st = "-**--";
			break;
			case 6: st = "-----";
			break;
			default:
				break;
			}
		}
		return st;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {


				if(sCurrentLine.length()<=0)
					continue;
				char[] charArray = sCurrentLine.trim().toCharArray();


				for(int ln = 1;ln<=6;ln++)
				{
					for(int i=0;i<charArray.length;i++)
					{
						if(Character.isDigit(charArray[i]))
						{
							System.out.print(getLine(Integer.parseInt(charArray[i]+""), ln));
						}
					}
					System.out.println("");
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
