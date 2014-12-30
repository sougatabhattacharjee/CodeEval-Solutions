package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class fibonacci {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/22/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int str = 0;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				str = Integer.parseInt(sCurrentLine);	

//				for (int i = 0; i <= str; i++) {
//			           System.out.println(fibonacci(7) + " ");
//			       }
				System.out.println(fibonacci(str));

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

//	private static int fibonacci(int str) {
//
//		int[] series = new int[str];
//
//		if(str>1)
//		{
//			series[0] = 1;
//			series[1] = 1;
//		}
//		else if(str == 1)
//			series[0] = 1;
//		else
//			return 0;
//
//		for(int i=2; i < str; i++){
//			series[i] = series[i-1] + series[i-2];
//		}
//
//
//		return series[str-1];
//	}
	
	public static int fibonacci(int n) {
	       if (n == 0) {
	           return 0;
	       } else if (n == 1) {
	           return 1;
	       } else {
	    	   System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
	    	  // int i = fibonacci(n - 1) + fibonacci(n - 2);
	    	   //System.out.println(i);
	    	   return 0;
	       }
	   }

}
