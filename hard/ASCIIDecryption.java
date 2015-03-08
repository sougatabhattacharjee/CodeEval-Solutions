package hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ASCIIDecryption {

	/**
	 * @param args
	 */
	
	public static int sequenceMatch(StringBuilder seq, String[] ascii,int index)
	{
		StringBuilder longSeqTmp = null;
		int k=0;
		int count = 0;
		while(k<=ascii.length-5)
		{
			longSeqTmp = new StringBuilder();
			for(int x=k;x<k+5;x++)
			{
				longSeqTmp.append(ascii[x]);
			}
			
			//System.out.println(longSeqTmp);System.out.println(seq);
			
			if(seq.toString().equals(longSeqTmp.toString()))
				count++;
			
			k++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			String str[] = null;

			int first = 0;
			String second  = null;
			String[] ascii = null;
			StringBuilder longSeq = null;
			

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				str = sCurrentLine.split("\\|");

				first = Integer.parseInt(str[0].trim());
				second = str[1].trim();
				ascii = str[2].trim().split("\\ ");
				
				for(int i=0;i<=ascii.length-5;i++)
				{
					longSeq = new StringBuilder();
					for(int j=i;j<i+5;j++)
					{
						longSeq.append(ascii[j]);
					}
					
					if(sequenceMatch(longSeq, ascii, i)==2)
					System.out.println(longSeq);
				}
				
				
				
				
				
				//System.out.println(Arrays.toString(ascii));
				
				//System.out.println(ascii.length);
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
