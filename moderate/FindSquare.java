package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FindSquare {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/101/
	 */

	public static int calculateDistance(int x1,int x2,int y1, int y2)
	{

		int result = (x2 - x1)*(x2 - x1) +
				(y2 - y1)*(y2 - y1);
		double a = (Math.sqrt(result));
		return (int)(Math.sqrt(result));
	}

	public static boolean rightAngle(int x, int y, int z)
	{
		if((x*x + y*y) == z*z)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				int	a = 0,b = 0,c = 0,d = 0;
				int dig1=0,dig2=0;
				boolean A=false,B=false,C=false,D=false;
				if(sCurrentLine.length()<=0)
					continue;

				sCurrentLine = sCurrentLine.replaceAll("[\\(\\)+.^: ]","");

				str = sCurrentLine.split(",");

				System.out.println(str.length);

				a = calculateDistance(Integer.parseInt(str[0]),Integer.parseInt(str[2]),Integer.parseInt(str[1]),Integer.parseInt(str[3]));
				b = calculateDistance(Integer.parseInt(str[2]),Integer.parseInt(str[4]),Integer.parseInt(str[3]),Integer.parseInt(str[5]));
				c = calculateDistance(Integer.parseInt(str[4]),Integer.parseInt(str[6]),Integer.parseInt(str[5]),Integer.parseInt(str[7]));
				d = calculateDistance(Integer.parseInt(str[6]),Integer.parseInt(str[0]),Integer.parseInt(str[7]),Integer.parseInt(str[1]));

				dig1 = calculateDistance(Integer.parseInt(str[0]),Integer.parseInt(str[4]),Integer.parseInt(str[1]),Integer.parseInt(str[5]));

				dig2 = calculateDistance(Integer.parseInt(str[2]),Integer.parseInt(str[6]),Integer.parseInt(str[3]),Integer.parseInt(str[7]));

				if(a==b && b==c && c==d && d==a)
				{
					if(rightAngle(a,b,dig1) && rightAngle(b,c,dig2) && rightAngle(c,d,dig1) && rightAngle(d,c,dig2))
						System.out.println("true");
					else
						System.out.println("false");
				}
				else
					System.out.println("false");

				//				System.out.println(a+""+b+""+c+""+d);
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
