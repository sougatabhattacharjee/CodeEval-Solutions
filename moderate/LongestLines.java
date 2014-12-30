import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LongestLines {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/2/
	 */
	
	static List<String> max(List<String> list,int s)
    {
       int max=0,count = 0;
       List<String> result =  new ArrayList<String>();
       
       while(count<s)
       {
    	   max = 0;
        for(int i=1;i<list.size();i++)
        {
            if((list.get(i).toString().length()>=list.get(max).toString().length()))
            max=i;
            
        }
        result.add(list.get(max).toString());
        
        list.remove(max);
        count++;
       }
        return result;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;

			List<String> result =  new ArrayList<String>();

			List<String> list =  new ArrayList<String>();

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()>0)
				list.add(sCurrentLine);
				
			}
			
			
			result = max(list,Integer.parseInt(list.get(0).toString()));
			
			for(String ele : result)
			{
				System.out.println(ele);
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
