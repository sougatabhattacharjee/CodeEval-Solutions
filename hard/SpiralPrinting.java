package hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SpiralPrinting {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/57/
	 */

	public static void spiralPrint(int row, int column, String matrix[][])
	{
	    int i, krow = 0, lcol = 0;
	 
	    /*  krow - starting row index
	        row - ending row index
	        lcol - starting column index
	        column - ending column index
	        i - iterator
	    */
	 
	    while (krow < row && lcol < column)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = lcol; i < column; ++i)
	        {
	            System.out.print(matrix[krow][i]+" ");
	        }
	        krow++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = krow; i < row; ++i)
	        {
	        	System.out.print(matrix[i][column-1]+" ");
	        }
	        column--;
	 
	        /* Print the last row from the remaining rows */
	        if ( krow < row)
	        {
	            for (i = column-1; i >= lcol; --i)
	            {
	            	System.out.print(matrix[row-1][i]+" ");
	            }
	            row--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (lcol < column)
	        {
	            for (i = row-1; i >= krow; --i)
	            {
	            	System.out.print(matrix[i][lcol]+" ");
	            }
	            lcol++;   
	        }       
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {

			String sCurrentLine;
			String[] ln;
			String[] num;
			
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;
				
				int row = 0;
				int column = 0;
				int count = 0;
				ln = sCurrentLine.trim().split(";");
				
				row = Integer.parseInt(ln[0]);
				column = Integer.parseInt(ln[1]);
				
				num = ln[2].trim().split(" ");
				
				String[][] matrix = new String[row][column];
				
				for(int i = 0;i<row;i++)
				{
					for(int j = 0;j<column;j++)
					{
						matrix[i][j] = (num[count]);
						count++;
					}
				}
				spiralPrint(row,column,matrix);
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
