package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class DoubleSquares {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/33/
	 */


	public static boolean isSqaureNumber(int num)
	{
		int sqrt = (int) Math.sqrt(num);
		if(sqrt*sqrt == num) {
			return true;
		}else {
			return false;
		}
	}


	public static int findLastSquareNumber(int num)
	{
		int i = num;
		while(i>1)
		{
			i--;
			if(isSqaureNumber(i))
				return i;
		}

		return num;
	}



	public static int findLastBoundary(int num)
	{

		return (int) Math.sqrt(num);
	}

	public static int countDoubleSquares(int x)
	{
		if (x == 0) {
			return 1;
		}
		
		int result = 0;
		for (int b = 0; b <= Math.pow(x, 0.5); b++) {
			int a = (int) Math.pow((x - Math.pow(b, 2)), 0.5);
			if (a < b) {
				break;
			}
			if (x == (Math.pow(a ,2) + Math.pow(b, 2))) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));
			int it = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				Map<Integer, Integer> numm = new HashMap<Integer, Integer>();
				if(sCurrentLine.length()<=0)
					continue;
				if(it==0)
				{
					it++;
					continue;
				}

				int num = Integer.parseInt(sCurrentLine.trim());

				/*int range = isSqaureNumber(num)?findLastBoundary(num):findLastBoundary(findLastSquareNumber(num));

				for(int i=0;i<=range;i++)
				{
					for(int j=0;j<=range;j++)
					{
						if((i*i+j*j)==num)
						{
							if(numm.containsKey(j))
							{
								if(numm.get(j)!=i)
									numm.put(i, j);

							}
							else
								numm.put(i, j);

						}
					}
				}
*/



				System.out.println(countDoubleSquares(num));
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
