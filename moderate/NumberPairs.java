import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


public class NumberPairs {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/34/
	 */




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String[] num = null;
			String result = "";
			List<Integer> nn = null;
			Map<Integer, Integer> mm ;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()==0)
					continue;
				boolean flag = false;
				result = "";
				str = sCurrentLine.trim().split(";");
				num = str[0].trim().split(",");
				nn = new ArrayList<Integer>();
				
				mm = new HashMap<Integer, Integer>();
				
				for(String ele:num)
					nn.add(Integer.parseInt(ele));
				
				

				//while(nn.size()>1)
				{
					
				for(int i=0;i<nn.size();i++)
				{
					Collections.sort(nn);
					for(int j=0;j<nn.size();j++)
					{
						if(i!=j)
						{
							if(nn.get(i)+nn.get(j)==Integer.parseInt(str[1]))
							{
								
								//result = result + nn.get(i) + "," + nn.get(j) + ";";
								flag = true;
								
								if(mm.containsKey(nn.get(j)))
								{
									int val = mm.get(nn.get(j));
									if(val!=nn.get(i))
								mm.put(nn.get(i), nn.get(j));
								}
								else
									mm.put(nn.get(i), nn.get(j));
								
								//nn.remove(i);
								//nn.remove(j-1);
								break;
							}
//							else
//								result = "NONE";
						}
					}
				}
				}
				//System.out.println(mm.size());
				
				SortedSet<Integer> keys = new TreeSet<Integer>(mm.keySet());
				for (Integer key : keys) { 
				   Integer value = mm.get(key);
				   
				   result = result + key + "," + value + ";";
				   // do something
				}
				
				
			if(flag)
				System.out.println(result.substring(0, result.length()-1));
			else
				System.out.println("NULL");
			}
			
			
		}catch (IOException e) {
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
