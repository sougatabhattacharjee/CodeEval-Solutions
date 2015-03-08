package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class UniqueElements {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/29/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			List<Integer> a = null;
			String result = "";


			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				str = sCurrentLine.split(",");

				a= new ArrayList<Integer>();
				for(String el:str)
					a.add(Integer.parseInt(el));



				for(int i = 0; i<a.size();i++)
				{
					for(int j=i+1;j<a.size();)
					{
						//						System.out.println(a.get(i)+">>"+a.get(j));
						if(a.get(i)<a.get(j))
							break;
						if(a.get(i)==a.get(j))
						{
							a.remove(j);

						}

					}
				}

				result = "";
				for(int el:a)
					result =result+ String.valueOf(el) +",";

				System.out.println(result.substring(0, result.length()-1));

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
