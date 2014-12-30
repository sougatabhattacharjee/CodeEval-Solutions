package easy;

import java.io.File;


public class FileSize {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/25/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file =new File(args[0]);
		if(file.exists()){
			 
			double bytes = file.length();
			System.out.println((int)bytes);
		}

	}

}
