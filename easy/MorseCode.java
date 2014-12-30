package easy;

import java.io.*;
import java.util.HashMap;
public class MorseCode
{
	public static void main (String[] args)
			throws IOException
			{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		HashMap<String,String> map = new HashMap<String,String>();

		map.put(".-", "A");
		map.put("-...", "B");
		map.put("-.-.", "C");
		map.put("-..", "D");
		map.put(".", "E");
		map.put("..-.", "F");
		map.put("--.", "G");
		map.put("....", "H");
		map.put("..", "I");
		map.put(".---", "J");
		map.put("-.-", "K");
		map.put(".-..", "L");
		map.put("--", "M");
		map.put("-.", "N");
		map.put("---", "O");
		map.put(".--.", "P");
		map.put("--.-", "Q");
		map.put(".-.", "R");
		map.put("...", "S");
		map.put("-", "T");
		map.put("..-", "U");
		map.put("...-", "V");
		map.put(".--", "W");
		map.put("-..-", "X");
		map.put("-.--", "Y");
		map.put("--..", "Z");
		map.put(".----", "1");
		map.put("..---", "2");
		map.put("...--", "3");
		map.put("....-", "4");
		map.put(".....", "5");
		map.put("-....", "6");
		map.put("--...", "7");
		map.put("---..", "8");
		map.put("----.", "9");
		map.put("-----", "0");
		while ((line = in.readLine()) != null) {
			line = line.trim();
			String[] lineArray = line.split(" ");
			for (String s : lineArray) {
				if (s.isEmpty()) {
					System.out.print(" ");
				} else {
					System.out.print(map.get(s));
				}
			}
			System.out.println();
		}
		in.close();
			}
	
}