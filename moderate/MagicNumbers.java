package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MagicNumbers {

	/**
	 * @param name
	 * https://www.codeeval.com/open_challenges/193/
	 */

    public static boolean isRepeat(String name) {
        boolean res = false;
        Map<Character, Integer> names = new HashMap<Character, Integer>();
        for(int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            Integer count = names.get(c);
            if (count == null) {
                count = 0;
            }
            if (count == 1) {
                res = true;
                return res;
            }
            names.put(c, count + 1);
        }
    return res;
    }

    public static boolean isVisitOnce(String name) {
        boolean res = true;
        char c = 0;
        Map<Character, Integer> names = new HashMap<Character, Integer>();
        for(int i = 0; i < name.length(); i++) {
            if(i==0)
                c = visitChar(name,name.charAt(i),name.indexOf(name.charAt(i)));
            else
                c = visitChar(name,c,name.indexOf(c));
            Integer count = names.get(c);
            if (count == null) {
                count = 0;
            }
            if (count == 1) {
                res = false;
                return res;
            }
            names.put(c, count + 1);
        }
        return res;
    }

    public static char visitChar(String name, char c, int index) {
        int limit = Integer.parseInt(c +"");
        if(limit == 0)
            return name.charAt(index);
        int j = 0;
        char vv = 0;
        int h = index+1;
        for(int i = 1; i <= limit; i++) {
            if(h>name.length()-1){
                h=0;
              }
            if(i==limit) {
               vv  = name.charAt(h);
               break;
            }
            h++;
        }
        return vv;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int input = 0;
			String[] str = null;
			
			java.util.Stack<Integer> stk = null;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
                boolean flag = false;
                String low = sCurrentLine.trim().split(" ")[0];
                String high = sCurrentLine.trim().split(" ")[1];

                int l = Integer.parseInt(low);
                int h = Integer.parseInt(high);

                for(int i = l; i<=h; i++){
                    if(!isRepeat(String.valueOf(i)) && isVisitOnce(String.valueOf(i))){
                        flag = true;
                        System.out.print(i + " ");
                    }
               }
                if(!flag)
                    System.out.print("-1");
                System.out.println();
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
