package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SwapElements {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/112/
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			String[] pos = null;
			String[] rep = null;
			String[] cc = null;
			String tmp = "";
			br = new BufferedReader(new FileReader(args[0]));
			
			

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;
				
				ch = sCurrentLine.trim().split(":");
				rep = ch[0].trim().split(" ");
				pos = ch[1].trim().split(",");
				
				for(int i =0;i<pos.length;i++)
				{
					cc = pos[i].trim().split("-");
					tmp = rep[Integer.parseInt(cc[0])];
					rep[Integer.parseInt(cc[0])] = rep[Integer.parseInt(cc[1])];
					rep[Integer.parseInt(cc[1])] = tmp;
				}
				
				StringBuilder builder = new StringBuilder();
				for(String s : rep) {
				    builder.append(s+" ");
				}
				
				
				System.out.println(builder.toString().trim());
				
				
				
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
