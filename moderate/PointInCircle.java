import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;



public class PointInCircle {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/98/
	 */



public static double RoundTo2Decimals(double val) {
            DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.valueOf(df2.format(val));
}

public static boolean in_circle(double center_x, double center_y, double radius, double x, double y)
{
    double square_dist = (center_x - x) * (center_x - x) + (center_y - y) * (center_y - y);
    return square_dist <= radius * radius;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			String[] num = null;
			double center_x;
			double center_y;
			double radius;
			double point_x;
			double point_y;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()==0)
					continue;
				sCurrentLine = sCurrentLine.replaceAll("[a-zA-Z:)( ]", "");
				
				str = sCurrentLine.trim().split(";");
				
				num = str[0].trim().split(",");
				center_x = Double.parseDouble(num[0]);
				center_y = Double.parseDouble(num[1]);
				
				num = str[1].trim().split(",");
				radius = Double.parseDouble(num[0]);
				
				num = str[2].trim().split(",");
				point_x = Double.parseDouble(num[0]);
				point_y = Double.parseDouble(num[1]);
				
				
				System.out.println(in_circle(center_x,center_y,radius,point_x,point_y));
			
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
