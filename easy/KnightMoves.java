package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KnightMoves {

	/**
	 * https://www.codeeval.com/open_challenges/180/
	 */

    public static String get_col(int column)
    {
        switch (column){
            case 1: return "a";
            case 2: return "b";
            case 3: return "c";
            case 4: return "d";
            case 5: return "e";
            case 6: return "f";
            case 7: return "g";
            case 8: return "h";
            default: return null;

        }
    }

    public static int get_int(String c)
    {
        switch (c){
            case "a" : return 1;
            case "b" : return 2;
            case "c" : return 3;
            case "d" : return 4;
            case "e" : return 5;
            case "f" : return 6;
            case "g" : return 7;
            case "h" : return 8;
            default: return 0;

        }
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

                int row = Integer.parseInt(sCurrentLine.substring(1));
                int col = get_int(sCurrentLine.substring(0,1));

                List<String> moves = new ArrayList<String>();

                if(col-2>=1 && row+1<=8)
                    moves.add(get_col(col - 2) + (row + 1));

                if(col-2>=1 && row-1>=1)
                    moves.add(get_col(col - 2) + (row - 1));

                if(col+2<=8 && row+1<=8)
                    moves.add(get_col(col + 2) + (row + 1));

                if(col+2<=8 && row-1>=1)
                    moves.add(get_col(col + 2) + (row - 1));


                if(row+2<=8 && col-1>=1)
                    moves.add(get_col(col - 1) + (row + 2));

                if(row+2<=8 && col+1<=8)
                    moves.add(get_col(col + 1) + (row + 2));

                if(row-2>=1 && col-1>=1)
                    moves.add(get_col(col - 1) + (row - 2));

                if(row-2>=1 && col+1<=8)
                    moves.add(get_col(col + 1) + (row - 2));


                Collections.sort(moves);

                for(String s : moves)
                    System.out.print(s + " ");
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
