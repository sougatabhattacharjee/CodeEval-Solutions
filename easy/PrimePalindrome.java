package easy;


public class PrimePalindrome {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/3/
	 */
	public static boolean isPrime(int num){
		for(int i=2; i<num; i++){
			if(num%i == 0){
				return false; 
			}
		}
		return true; 
	}
	
	private static boolean palindrome(int input) {
		int n = input;
		int rev = 0,dig=0;
		while (input > 0)
		{
			dig = input % 10;
			rev = rev * 10 + dig;
			input = input / 10;
		}

		if(n == rev)		 
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 999; i>0; i--)
		{
			if(isPrime(i))
			{
				if(palindrome(i))
				{
					System.out.println(i);
					break;
				}
			}
			
		}
		
		
	}

}
