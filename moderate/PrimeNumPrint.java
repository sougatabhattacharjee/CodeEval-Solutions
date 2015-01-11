package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * https://www.codeeval.com/open_challenges/46/
 * Print out the prime numbers less than a given number N. 
 * Input sample:
 * 10
   20
   100
 */



public class PrimeNumPrint {

	/**
	 * @param args
	 */

	public static boolean isPrime(int num){
		for(int i=2; i<num; i++){
			if(num%i == 0){
				return false; 
			}
		}
		return true; 
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			StringBuffer result = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				result = new StringBuffer();
				for(int i=2;i<Integer.parseInt(sCurrentLine.trim());i++)
				{

					if(isPrime(i))
					{

						result.append(i+",");


					}


				}

				String mynewstring = result.toString();
				mynewstring = mynewstring.substring(0, mynewstring.length()-1);
				System.out.println(mynewstring);



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
