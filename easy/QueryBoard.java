package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class QueryBoard {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/87/
	 */

	static int[][]query_board = new int[256][256];
	private static void QueryCol(String s) {
        
        String[] op = s.split(" ");
        int sum = 0;
         
        for (int i = 0; i < query_board.length; i++) {
            sum += query_board[i][Integer.parseInt(op[1]) - 1];
        }
        System.out.println(sum);
    }
    private static void QueryRow(String s) {
      
        String[] op = s.split(" ");
        int sum = 0;
         
        for (int i = 0; i < query_board.length; i++) {
            sum += query_board[Integer.parseInt(op[1]) - 1][i];
        }
        System.out.println(sum);
    }
 
    private static void SetCol(String s) {
        
        String[] op = s.split(" ");
 
        for (int i = 0; i < query_board.length; i++) {
        	query_board[i][Integer.parseInt(op[1]) - 1] = Integer.parseInt(op[2]);
        }
    }
     
    private static void SetRow(String s) {
        
        String[] op = s.split(" ");
         
        for (int i = 0; i < query_board.length; i++) {
        	query_board[Integer.parseInt(op[1]) - 1][i] = Integer.parseInt(op[2]);
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

				if(sCurrentLine.length()==0)
					continue;

				
				  str = sCurrentLine.split(" ");
			        if(str[0].equals("QueryCol"))
			            QueryCol(sCurrentLine);
			        else if(str[0].equals("QueryRow"))
			            QueryRow(sCurrentLine);
			        else if(str[0].equals("SetCol"))
			            SetCol(sCurrentLine);
			        else if(str[0].equals("SetRow"))
			            SetRow(sCurrentLine);
				
				

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
