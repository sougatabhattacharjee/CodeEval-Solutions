import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class WordChain {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/135/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			char a,b;
			
			
			br = new BufferedReader(new FileReader(args[0]));
			HashSet<String> val = null;
			
			while ((sCurrentLine = br.readLine()) != null) {
				val = new HashSet<String>();
				ch = sCurrentLine.trim().split(",");
				
				for(int i=0;i<ch.length;i++)
				{
					for(int j=0;j<ch.length;j++)
					{
						a = ch[i].charAt(ch[i].length()-1);
						b = ch[j].charAt(0);
						if(i==j)
							continue;
//						if(Character.toLowerCase(a)==Character.toLowerCase(b))
						if(a==b)
						{
							val.add(ch[i]);
							val.add(ch[j]);
						}
					}
				}
				
				if(val.size()>1)
			System.out.println(val.size());
				else
					System.out.println("None");
					
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
