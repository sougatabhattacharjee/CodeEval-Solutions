package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ShortestRepetition {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/107/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				sCurrentLine = sCurrentLine.trim();
				for (int i = 1; i <= sCurrentLine.length(); i++) {
					String sub = sCurrentLine.substring(0, i);
					String[] lineArray = sCurrentLine.split(sub);
					boolean aa = true;
					
					for (String s : lineArray) {
						if (!s.isEmpty()) {
							aa = false;
							break;
						}
					}
					if (aa) {
						System.out.println(sub.length());
						break;
					}


				}
			}
		}catch (IOException e) {
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
