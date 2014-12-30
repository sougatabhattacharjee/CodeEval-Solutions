package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class JugglingWithZeros {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/149/
	 */
	public static Integer binaryToInteger(String binary){
	    char[] numbers = binary.toCharArray();
	    Integer result = 0;
	    int count = 0;
	    for(int i=numbers.length-1;i>=0;i--){
	         if(numbers[i]=='1')result+=(int)Math.pow(2, count);
	         count++;
	    }
	    return result;
	}

	public static long integerfrmbinary(String str){
	    double j=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)== '1'){
	         j=j+ Math.pow(2,str.length()-1-i);
	     }

	    }
	    return (long) j;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String result = "";
			String tmp = "";
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				result = "";tmp = "";
				str = sCurrentLine.split(" ");

				for(int i = 0;i<str.length;i = i+2)
				{
					if(str[i].equals("00"))
					{
						tmp = str[i+1].trim().replace('0', '1');
						result = result + tmp;
					}

					if(str[i].equals("0"))
					{

						result = result + str[i+1];
					}
				}


				System.out.println(integerfrmbinary(result.trim()));
				
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
