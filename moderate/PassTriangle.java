package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PassTriangle {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/89/
	 */
	
	static int max(String list)
    {
       int max=0;
       
      
        for(int i=1;i<list.length();i++)
        {
            if(list.charAt(i)>=list.charAt(max))
            max=i;
            
        }
       return Integer.parseInt(list.charAt(max)+"");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;

		try {

			String sCurrentLine;
			int result = 0;

			List<String> lines = new ArrayList<String>();

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				sCurrentLine = sCurrentLine.replaceAll("\\s+","");
				lines.add(sCurrentLine);
				
			}
			
			for(int i=0;i<lines.size();i++)
			{
				String tmp = lines.get(i).toString();
				System.out.println(max(tmp));
				result = result +max(tmp);
			}
			
			System.out.println(result);
			

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
