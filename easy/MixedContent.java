package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MixedContent {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/115/
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;

			br = new BufferedReader(new FileReader(args[0]));

			String wo = "";
			String no="";



			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split(",");

				wo = "";
				no="";


				for(int i=0;i<ch.length;i++)
				{
					if((ch[i].charAt(0)>='A' && ch[i].charAt(0)<='Z') || (ch[i].charAt(0)>='a' && ch[i].charAt(0)<='z'))
					{
						wo = wo + ch[i] + ",";
					}
					else
					{
						no = no + ch[i] + ",";
					}
				}

				if(wo.length()>0 && no.length()>0)
				{
					System.out.println(wo.substring(0, wo.length()-1)+"|"+no.substring(0, no.length()-1));
					continue;
				}
				if(wo.length()>0){
					System.out.println(wo.substring(0, wo.length()-1));
					continue;
				}
				if(no.length()>0){
					System.out.println(no.substring(0, no.length()-1));
					continue;
				}

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
