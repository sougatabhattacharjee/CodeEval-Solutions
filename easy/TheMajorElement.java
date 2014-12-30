package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TheMajorElement {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/132/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			HashMap<Integer, Integer> count = null;
			int value = 0;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				boolean re = true;
				count = new HashMap<Integer, Integer>();
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split(",");

//				System.out.println(ch.length);
				
				for(String ele:ch)
				{
					if(!count.containsKey(Integer.parseInt(ele)))
						count.put(Integer.parseInt(ele), 1);
					else
					{
						value = count.get(Integer.parseInt(ele));
						value = value+1;
						count.put(Integer.parseInt(ele),value);
					}
				}
				
				Iterator it = count.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pairs = (Map.Entry)it.next();
			       // System.out.println(pairs.getKey() + " = " + pairs.getValue());
			        //it.remove(); // avoids a ConcurrentModificationException
			       
			        if((Integer)pairs.getValue()>ch.length/2)
			        {
			        	re = false;
			        	System.out.println(pairs.getKey() );
			        }
			        
			    }
			    
				if(re)
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
