package easy;


public class MultiplicationTables {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/23/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=12;i++)
		{
			for(int j=1;j<=12;j++)
			{
				
					System.out.print(String.format("%4d",+i*j));
				
			}
			System.out.println("");
		}





	}

}
