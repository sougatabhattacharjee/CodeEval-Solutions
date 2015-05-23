package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Stack;


public class ColumnNames {

	/**
	 * @param x
	 * https://www.codeeval.com/open_challenges/197/
	 */



	public static char alphabet(int x)
	{
		switch (x){
            case 0 : return 'Z';
            case 1 : return 'A';
            case 2 : return 'B';
            case 3 : return 'C';
            case 4 : return 'D';
            case 5 : return 'E';
            case 6 : return 'F';
            case 7 : return 'G';
            case 8 : return 'H';
            case 9 : return 'I';
            case 10 : return 'J';
            case 11 : return 'K';
            case 12 : return 'L';
            case 13 : return 'M';
            case 14 : return 'N';
            case 15 : return 'O';
            case 16 : return 'P';
            case 17 : return 'Q';
            case 18 : return 'R';
            case 19 : return 'S';
            case 20 : return 'T';
            case 21 : return 'U';
            case 22 : return 'V';
            case 23 : return 'W';
            case 24 : return 'X';
            case 25 : return 'Y';
            default: return '0';
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] str = null;
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				if(sCurrentLine.length()<=0)
					continue;

                java.util.Stack<Character> stk = new Stack<Character>();

                int number = Integer.parseInt(sCurrentLine.trim());


                while(number>0){
                stk.push(alphabet(number%26));
                number = number%26==0? (number/26) -1 : number/26;
                }

                while(!stk.isEmpty()) {
                    System.out.print(stk.pop());
                }

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
