package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * You are given a text. Your job is to write a program to set the case of text characters based on the following:

    First letter of the line should be upper case.
    Next letter should be lower case.
    Next letter should be upper case and so on...
    Any characters, except the letters, are ignored during determination of letters case.

Input sample:

The first argument will be a path to a filename containing sentences, one per line. You can assume all characters are from the english language. E.g.:

To be, or not to be: that is the question.
Whether 'tis nobler in the mind to suffer
The slings and arrows of outrageous fortune,
Or to take arms against a sea of troubles,
And by opposing end them? To die: to sleep.

Output sample:

Print to stdout, the RoLlErCoAsTeR case version of the string. E.g.:

To Be, Or NoT tO bE: tHaT iS tHe QuEsTiOn.
WhEtHeR 'tIs NoBlEr In ThE mInD tO sUfFeR
ThE sLiNgS aNd ArRoWs Of OuTrAgEoUs FoRtUnE,
Or To TaKe ArMs AgAiNsT a SeA oF tRoUbLeS,
AnD bY oPpOsInG eNd ThEm? To DiE: tO sLeEp.
 */

public class RollerCoaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
			
			String str[] = null;
			
			int j = 0;
			
			StringBuffer result = null;
			
			br = new BufferedReader(new FileReader(args[0]));
 
			while ((sCurrentLine = br.readLine()) != null) {
				
				str = sCurrentLine.split("(?!^)");
				
				for(int i=0;i<str.length;i++)
				{
					if(Character.isLetter(str[i].charAt(0)) && j%2==0)
					{
						str[i] = str[i].toUpperCase();
						j++;
					}
					else if(Character.isLetter(str[i].charAt(0)) && j%2!=0)
					{
						str[i] = str[i].toLowerCase();
						j++;
					}
				}
				
				result = new StringBuffer();
				
				for (int i = 0; i < str.length; i++) {
				   result.append( str[i] );
				}
				String mynewstring = result.toString();
				
				System.out.println(mynewstring);
				
				j = 0;
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
