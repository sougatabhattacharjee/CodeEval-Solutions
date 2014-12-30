package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;




public class BeautifulStrings {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/83/
	 */
	
	
	
	public static int getBeauty(String s) {
		int i = -1;
		Map<Character, Integer> lettersOccurencesMap = new HashMap<Character, Integer>();
		try {
			while (true) {
				i++;
				Character c = s.charAt(i);
				c = Character.toLowerCase(c);
				if (c < 'a' || c > 'z') {
					continue;
				}
				// Increasing the number of occurence by 1
				Integer occurence = lettersOccurencesMap.get(c);
				if (occurence == null) {
					occurence = 1;
				} else {
					occurence++;
				}
				lettersOccurencesMap.put(c, occurence);
			}
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		ArrayList<Integer> integerList = new ArrayList<Integer>(
				lettersOccurencesMap.keySet().size() * 4 / 3);
		for (Character letter : lettersOccurencesMap.keySet()) {
			integerList.add(lettersOccurencesMap.get(letter));
		}

		// Collection.sort sorts in ascending order
		Collections.sort(integerList);

		int beauty = 0;
	
		int nextHighestBeauty = 26;
		for (i = integerList.size() - 1; i >= 0; i--) {
			Integer occurence = integerList.get(i);
			beauty = beauty + (occurence * nextHighestBeauty);
			nextHighestBeauty--;
		}
		return beauty;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				 sCurrentLine = sCurrentLine.replaceAll("[^'a-zA-Z ]", "");
				
				System.out.println(getBeauty(sCurrentLine));
				
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

/*
 * Another approach
 
public class beautifulString
{
	public static void main (String[] args)
			throws IOException
			{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			line = line.trim();
			System.out.println(findMaxBeautyOfString(line));
		}
		in.close();
			}
	/**
	 * Find the maximum beauty of a given string.
	 *
	 * Algorithm: start by throwing all characters into a Map so that we can count all character
	 * frequency in O(n) time. Next, we need to sort the elements of our map by value. Do so using
	 * a custom value comparator and a TreeSet. Then, using the ordered set, compute the maximum
	 * beauty.
	 *
	 * Overall runtime: O(n*ln(n)).
	 */
/*public static int findMaxBeautyOfString(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			c = Character.toLowerCase(c);
			if (!Character.isLetter(c)) {
				continue;
			}
			if (map.containsKey(c)) {
				int value = map.get(c);
				map.put(c, value+1);
			} else {
				map.put(c, 1);
			}
		}
		ValueComparator bvc = new ValueComparator(map);
		TreeMap<Character, Integer> sortedMap = new TreeMap<Character, Integer>(bvc);
		sortedMap.putAll(map);
		
		int currentLetterValue = 26;
		int maxStringBeauty = 0;
		for (char c : sortedMap.keySet()) {
			int letterFrequency = map.get(c);
			maxStringBeauty += letterFrequency * currentLetterValue;
			currentLetterValue--;
		}
		return maxStringBeauty;
	}
	/**
	 * Implementation adapter from stack overflow:
	 * http://stackoverflow.com/questions/109383/how-to-sort-a-mapkey-value-on-the-values-in-java
	 */
/*private static class ValueComparator implements Comparator<Character>
	{
		Map<Character, Integer> _base;
		public ValueComparator(Map<Character, Integer> base)
		{
			_base = base;
		}
		/**
		 * Note: this comparator imposes orderings that are inconsistent with equals.
		 */
/*@Override
		public int compare(Character a, Character b)
		{
			// N.B. Returning 0 would merge keys.
			if (_base.get(a) >= _base.get(b)) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}*/
