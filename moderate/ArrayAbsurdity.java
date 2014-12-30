import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ArrayAbsurdity {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/41/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] ch = null ;
			String result = "";
			
			
			br = new BufferedReader(new FileReader(args[0]));
			String[] num = null;
			
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				ch = sCurrentLine.trim().split(";");
				num = ch[1].split(",");
				
				
				for(int i=0;i<num.length;i++)
				{
					for(int j=0;j<num.length;j++)
					{
						if(i==j)
							continue;
						if(num[i].equals(num[j]))
						{
							result = num[i];
							break;
						}
					}
				}
				
				
				System.out.println(result);
				
//				
					
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
