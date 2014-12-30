import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/*
 * https://www.codeeval.com/open_challenges/54/
 */



public class CashRegister {




	public static double RoundTo2Decimals(double val) {
		DecimalFormat df2 = new DecimalFormat("###.##");
		return Double.valueOf(df2.format(val));
	}


public static String cash(double poisa)
{
	
	String result="";
	while(poisa>0.00)
	{
		if(poisa>=100.00)
		{
			poisa = RoundTo2Decimals(poisa - 100.00);
			result += "ONE HUNDRED"+",";
			continue;
		}
		if(poisa>=50.00)
		{
			poisa = RoundTo2Decimals(poisa - 50.00);
			result += "FIFTY"+",";
			continue;
		}
		if(poisa>=20.00)
		{
			poisa = RoundTo2Decimals(poisa - 20.00);
			result += "TWENTY"+",";
			continue;
		}
		if(poisa>=10.00)
		{
			poisa = RoundTo2Decimals(poisa - 10.00);
			result += "TEN"+",";
			continue;
		}
		if(poisa>=5.00)
		{
			poisa = RoundTo2Decimals(poisa - 5.00);
			result += "FIVE"+",";
			continue;
		}
		if(poisa>=2.00)
		{
			poisa = RoundTo2Decimals(poisa - 2.00);
			result += "TWO"+",";
			continue;
		}
		if(poisa>=1.00)
		{
			poisa = RoundTo2Decimals(poisa - 1.00);
			result += "ONE"+",";
			continue;
		}
		if(poisa>=0.50)
		{
			poisa = RoundTo2Decimals(poisa - 0.50);
			result += "HALF DOLLAR"+",";
			continue;
		}
		if(poisa>=0.25)
		{
			poisa = RoundTo2Decimals(poisa - 0.25);
			result += "QUARTER"+",";
			continue;
		}
		if(poisa>=0.10)
		{
			poisa = RoundTo2Decimals(poisa - 0.10);
			result += "DIME"+",";
			continue;
		}
		if(poisa>=0.05)
		{
			poisa = RoundTo2Decimals(poisa - 0.05);
			result += "NICKEL"+",";
			continue;
		}
		if(poisa>=0.01)
		{
			poisa = RoundTo2Decimals(poisa - 0.01);
			result += "PENNY"+",";
			continue;
		}
	}
	
	
	
	
	return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String[] n;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(args[0]));

			while ((sCurrentLine = br.readLine()) != null) {

				n = sCurrentLine.trim().split(";");

				double left,right;

				left = Double.valueOf(n[0]);
				right = Double.valueOf(n[1]);

				if(left>right)
				{
					System.out.println("ERROR");
					continue;
				}
				if(left==right)
				{
					System.out.println("ZERO");
					continue;
				}	
				
				if(left<right)
				{
					System.out.println(cash(RoundTo2Decimals(right-left)).substring(0, cash(RoundTo2Decimals(right-left)).length()-1));
					continue;
				}
				

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
