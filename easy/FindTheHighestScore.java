package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class FindTheHighestScore {

	/**
	 * https://www.codeeval.com/open_challenges/208/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;
				String[] numbers = sCurrentLine.trim().split("\\|");
				int size = numbers[0].trim().split(" ").length;

				for(int j = 0;j<size;j++){
					int arr[] = new int[numbers.length];
					for(int i=0; i<numbers.length;i++){
						arr[i] = Integer.parseInt(numbers[i].trim().split(" ")[j]);
					}
					Arrays.sort(arr);
					System.out.print(arr[arr.length-1]+" ");
				}
				System.out.println();
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
