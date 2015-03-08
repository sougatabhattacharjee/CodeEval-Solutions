package hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class DiscountOffers {

	/**
	 * @param args
	 */
	
	public static boolean isCommonFactor(int a, int b){
		for(int i=2; i<a; i++){
			if(a%i == 0){
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
			
			String str[] = null;
			
			String customer[]= null;
			
			String product[] = null;
			
			int j = 0;
			
			StringBuffer result = null;
			
			float ss = 0;
			
			int vowels=0;
			
			br = new BufferedReader(new FileReader(args[0]));
 
			while ((sCurrentLine = br.readLine()) != null) {
				
				str = sCurrentLine.split(";");
				
				str[0] = str[0].replaceAll("[^a-zA-Z ]", "");
				
				str[1] = str[1].replaceAll("[^a-zA-Z ]", "");
				
				customer = str[0].replaceAll("\\s+", "").split("(?!^)");
				
				product = str[1].replaceAll("\\s+", "").split("(?!^)");
				
			
				if(product.length%2==0)
				{
					for(String el:customer)
					{
						if(el.equalsIgnoreCase("a")||el.equalsIgnoreCase("e")||el.equalsIgnoreCase("i")||el.equalsIgnoreCase("o")||el.equalsIgnoreCase("a")||el.equalsIgnoreCase("u")||el.equalsIgnoreCase("y"))
						{
							vowels=vowels+1;
						}
						ss = (float) (vowels*1.5);
					}
				}
				if(product.length%2!=0)
				{
					for(String el:customer)
					{
						if(el.equalsIgnoreCase("a")||el.equalsIgnoreCase("e")||el.equalsIgnoreCase("i")||el.equalsIgnoreCase("o")||el.equalsIgnoreCase("a")||el.equalsIgnoreCase("u")||el.equalsIgnoreCase("y"))
						{
							vowels=vowels+1;
						}
						ss = (float) (customer.length-vowels);
					}
				}
				
				
				
				
				System.out.println(">>"+ss);	
			
			
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
