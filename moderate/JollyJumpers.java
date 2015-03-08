package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class JollyJumpers {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/43/
	 */
	public static int largest = Integer.MIN_VALUE;
	public static int secondLargest = Integer.MIN_VALUE;

	private static int secondLargest(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		return secondLargest;
	}

	public static boolean jolly(int[] diff, int secondlarge)
	{

		boolean flag = true;
		int size = diff.length; 
		if(size==1 && diff[0]==1)
			return true;
		if(size==1 && diff[0]!=1)
			return false;


		if(size==secondlarge)
		{
			for(int i=0;i<secondlarge;i++)
			{
				if(diff[i]==i+1)
					flag =  true;
				else
					return false;
			}
		}
		else
			return false;

		return flag;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			String[] str = null;

			int[] diff = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {


				if(sCurrentLine.length()==0)
					continue;

				str = sCurrentLine.trim().split(" "); 

				if (str.length == 1) {
					System.out.println("Jolly");
					continue;
				}

				diff = new int[str.length-1];
				for(int i=0;i<str.length-1;i++)
				{
					diff[i] = (Math.abs(Integer.parseInt(str[i+1]) - Integer.parseInt(str[i])));
				}


				Arrays.sort(diff);


				int[] numbers = new int[str.length];
				for(int i = 0;i < str.length;i++)
				{
					numbers[i] = Integer.parseInt(str[i]);
				}
				//System.out.println(secondLargest(numbers));
				System.out.println(jolly(diff, secondLargest(numbers))?"Jolly":"Not jolly");



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
