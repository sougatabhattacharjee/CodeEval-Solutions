package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DeltaTime {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/166/
	 */

	public static int getSec(String[] st)
	{
		int min = Integer.parseInt(st[0].trim())*60 + Integer.parseInt(st[1].trim());
		int sec = min * 60 + Integer.parseInt(st[2].trim());
		return sec;
	}

	public static String getTime(int t)
	{
		String h,m,s;
		int hr = t / 3600;
		int min = (t % 3600) / 60;
		int sec = (t % 3600) - (min * 60);
		
		h = hr<10?"0"+hr:hr+"";
		m = min<10?"0"+min:min+"";
		s = sec<10?"0"+sec:sec+"";
		
		
		return h+":"+m+":"+s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] time;
			String[] leftTime;
			String[] rightTime;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {


				if(sCurrentLine.length()<=0)
					continue;

				time = sCurrentLine.trim().split(" ");
				leftTime = time[0].trim().split(":");
				rightTime = time[1].trim().split(":");
				
				
				if(getSec(leftTime)>getSec(rightTime))
				{
					int diff = getSec(leftTime) - getSec(rightTime);
					System.out.println(getTime(diff));
				}
				else if(getSec(leftTime)<getSec(rightTime))
				{
					int diff = getSec(rightTime) - getSec(leftTime);
					System.out.println(getTime(diff));
				}
				else
					System.out.println("00:00:00");
				
				
				
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
