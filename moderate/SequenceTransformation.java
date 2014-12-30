import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * https://www.codeeval.com/open_challenges/17/
 */



public class SequenceTransformation {

	/**
	 * @param args
	 */

	public static int computeLargestContinuousSum(int[] array)
	{
		
		int initialSum = array[0];
		for (int start = 0; start < array.length; start++) {
			for (int end = start; end < array.length; end++) {
				int sum = CountSum(array, start, end);
				if (sum > initialSum) {
					initialSum = sum;
				}
				if (sum < 0) {
					break;
				}
			}
		}
		return initialSum;
	}
	
	private static int CountSum(int[] array, int start, int end)
	{
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += array[i];
		}
		return sum;
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

				String string = sCurrentLine.trim();
				String[] numbers = string.split(",");
				int[] nn = new int[numbers.length];
				int count = 0;
				for(String s: numbers)
					nn[count++] = Integer.parseInt(s);
				System.out.println(computeLargestContinuousSum(nn));
				

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
