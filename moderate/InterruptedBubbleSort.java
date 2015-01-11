package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
/*
 * https://www.codeeval.com/open_challenges/158/
 */
public class InterruptedBubbleSort {

	public static String[] BubbleSort(String a[],BigInteger count)
	{
		boolean swapped = true;
		int n = a.length;
		int num = 0;
		
		while(swapped)
		{
			swapped=false;

			for(int i=1;i<n;i++)
			{
				if(Integer.parseInt(a[i-1]) > Integer.parseInt(a[i]) )
				{
					swap(a,i,i-1);
					swapped = true;
					
				}
			
			}
			num++;
			BigInteger bigIntValue = new BigInteger(Integer.toString(num));
			if(bigIntValue.equals(count))
				return a;
			n--;
		}

		return a;
	}

	public static void swap(String a[],int i, int k)
	{
		int tmp=Integer.parseInt(a[i]);
		a[i]=(a[k]);
		a[k]=String.valueOf(tmp);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		String sCurrentLine;
		String str[] = null;
		String[] a = null;
		String result = "";
		try {
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";
				if(sCurrentLine.length()<=0)
					continue;
				
				
				str = sCurrentLine.trim().split("\\|");
				
				a = str[0].trim().split(" ");
				str[1] = str[1].replace(" ", "");
				BigInteger bi = new BigInteger(str[1]);
			for(String ele: BubbleSort(a,bi))
				result = result + " " + ele;
			
			System.out.println(result);
			
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
