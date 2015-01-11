package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/*
 * https://www.codeeval.com/open_challenges/71/
 */
public class reverseGroup {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		String sCurrentLine;
		String[] str = null;
		String[] num = null;
		int rightLen = 0,leftLen = 0;
		ArrayList<String> list = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				ArrayList<String> tmp = null;
				int co = 0;int k=0,m=0;
				rightLen = 0;leftLen = 0;
				if(sCurrentLine.length()<=0)
					continue;

				str = sCurrentLine.trim().split(";");
				num = str[0].trim().split(",");
				rightLen = Integer.parseInt(str[1]);

				leftLen = num.length;

				co = leftLen - rightLen;
				list = new ArrayList<String>();
				for(String ele: num)
				{
					
					list.add(ele);
				}


				while(co>=0)
				{
					tmp = new ArrayList<String>();
					for(int i=0;i<rightLen;i++)
					{
						
						tmp.add(num[m]);
						m++;
					}
					Collections.reverse(tmp);

					for(int j=0;j<rightLen;j++)
					{
						list.set(k, tmp.get(j));
						k++;
					}

					leftLen = leftLen - rightLen;
					co = leftLen - rightLen;
				}


				String result = "";
				for(String e:list)
					result = result+e+",";
				
				result = result.substring(0, result.length()-1);
				
				System.out.println(result);


			}
		}


		catch (IOException e) {
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
