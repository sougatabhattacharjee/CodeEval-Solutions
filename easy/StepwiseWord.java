package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StepwiseWord {

	/**
	 * https://www.codeeval.com/open_challenges/202/
	 */

	public static boolean ifAscii(char c){
		if((c>=65 && c<=90) || (c>=97 && c<=122))
			return true;
		return false;
	}

	public static String compare(String st1, String st2) {
		if (st1.length() >= st2.length()) {
			return st1;
		} else {
			return st2;
		}
	}

	public static String LongestWord(String[] words) {
		String word = "";
		for (int i = 0; i < words.length; i++) {
			if (i == 0) {
				word = words[0];
			}
			word = compare(word, words[i]);
		}
		return word;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch = null ;


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;

				String[] words = sCurrentLine.trim().split(" ");

				StringBuilder sb = new StringBuilder();

				String longestWord = LongestWord(words);

				for(int i=0; i<longestWord.length();i++){
					if(i>0) {
						int count = 0;
						while(count<i){
							sb.append('*');
							count++;
						}
						sb.append(longestWord.charAt(i));
						sb.append(' ');
						continue;
					}
					sb.append(longestWord.charAt(i));
					sb.append(' ');

				}






				System.out.println(sb.toString());
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
