package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MatrixRotation {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/178/
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String ch[];
			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.length()<=0)
					continue;

				ch = sCurrentLine.trim().split(" ");
				int count = 0;
				int row = (int) Math.sqrt(ch.length);
				int col = row;
				
				String[][] matrix = new String[row][col];
				
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						
						matrix[i][j] = ch[count++];
					}
				}
				matrix(matrix,row,col);
				
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

	private static void matrix(String[][] matrix,int row,int col) {
		for(int j=0;j<col;j++)
		{
			for(int i=row-1;i>=0;i--)
			{
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
}
