import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * https://www.codeeval.com/open_challenges/63/
 */



public class CountingPrimes {

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

			String[] n;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				n = sCurrentLine.trim().split(",");

				int lower = Integer.parseInt(n[0]);

				int upper = Integer.parseInt(n[1]);
				
				int count = 0;

				for(int i=lower;i<=upper;i++)
				{
					if(isPrime(i))
						count++;
				}
				
				System.out.println(count);



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
