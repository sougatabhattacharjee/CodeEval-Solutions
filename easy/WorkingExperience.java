package easy;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class WorkingExperience {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/139/
	 */

	public enum month{
		Jan(1),Feb(2),Mar(3),Apr(4),May(5),Jun(6),Jul(7),Aug(8),Sep(9),Oct(10),Nov(11),Dec(12);

		private final int enumValue;

		private month(int enumValue) {
			this.enumValue = enumValue;
		}

		public int enumValueAsInt() {
			return enumValue;
		}
	}

	public static void printMap(Map mp) {
		Long startDate = 0L;
		Long endDate = 0L;
		Map<Long, Long> finalmm = new HashMap<Long, Long>();
		Long[][] finalArray = new Long[mp.size()][mp.size()];
		Iterator it = mp.entrySet().iterator();
		int i=0;
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			Long date1 = (Long) pairs.getKey();
			Long date2 = (Long) pairs.getValue();

			finalArray[i++][0] = date1;
			finalArray[i++][1] = date2;
		}

		startDate = finalArray[0][0];
		endDate =  finalArray[0][1];

		for(int j = 1; j<finalArray.length;j++)
		{
			if(finalArray[j][0]<endDate && finalArray[j][1]<endDate)
			{
				j++;
				continue;
			}

			if(finalArray[j][0]<endDate && finalArray[j][1]>endDate)
			{
				j++;
				continue;
			}


		}


		//		System.out.println(pairs.getKey() + " = " + pairs.getValue());
		//		Date d2 = new Date(date2);
		//		Date d1 = new Date(date1);
		//		
		//		int diffInDays = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
		//		System.out.println(diffInDays / 30);
		//	        Date d = new Date((date2 - date1));	//The Date constructor accepts the time as long in milliseconds, not seconds. We need to multiply it by 1000 and make sure that we supply it as long.
		//	        System.out.println(d.getMonth());
		//it.remove(); // avoids a ConcurrentModificationException
	}



	public static List<Interval> merge(List<Interval> intervals) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if(intervals.size() == 0)
			return intervals;
		if(intervals.size() == 1)
			return intervals;
		Collections.sort(intervals, new IntervalComparator());
		Interval first = intervals.get(0);
		Long start = first.start;
		Long end = first.end;
		ArrayList<Interval> result = new ArrayList<Interval>();
		for(int i = 1; i < intervals.size(); i++){
			Interval current = intervals.get(i);
			if(current.start <= end){
				end = Math.max(current.end, end);
			}else{
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

				String str[];
				Map<Long, Long> mm = new HashMap<Long, Long>();

				str = sCurrentLine.trim().split(";");

				SimpleDateFormat formatter = new SimpleDateFormat("MMM yyyy");

				for(int i=0;i<str.length;i++)
				{
					String dateInString1 = str[i].trim().split("-")[0];
					String dateInString2 = str[i].trim().split("-")[1];
					try {
						Date date1 = formatter.parse(dateInString1);
						Date date2 = formatter.parse(dateInString2);
						if(!mm.containsKey(date1.getTime()))
							mm.put(date1.getTime(), date2.getTime());
						else
						{
							Long dt = mm.get(date1.getTime());
							if(dt<date2.getTime())
								mm.put(date1.getTime(), date2.getTime());
						}
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
				Map<Long, Long> treeMap = new TreeMap<Long, Long>(mm);
				//printMap(treeMap);

				List<Interval> intervals = new ArrayList<Interval>();
				Iterator it = treeMap.entrySet().iterator();
				int i=0;
				while (it.hasNext()) {
					Map.Entry pairs = (Map.Entry)it.next();
					Long date1 = (Long) pairs.getKey();
					Long date2 = (Long) pairs.getValue();
					intervals.add(new Interval(date1,date2));
				}

				List<Interval> result = merge(intervals);
				Long sum = 0L;
				for(Interval res : result) {
					//System.out.print(res.getStart() + "," + res.getEnd());
					//System.out.print(" ");
					sum+=res.getEnd() - res.getStart();
					
				}
				int diffInDays = (int) (sum / (1000 * 60 * 60 * 24));
				System.out.println((diffInDays / 30) / 12);
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

class Interval {
	Long start;
	Long end;
	Interval() { start = 0L; end = 0L; }
	Interval(Long s, Long e) { start = s; end = e; }

	public Long getStart() {
		return this.start;
	}

	public Long getEnd() {
		return this.end;
	}
}

class IntervalComparator implements Comparator{
	public int compare(Object o1, Object o2){
		Interval i1 = (Interval)o1;
		Interval i2 = (Interval)o2;
		return  (int) (i1.start - i2.start);
	}
} 
