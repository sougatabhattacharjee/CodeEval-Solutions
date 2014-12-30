package easy;

/*
 * Write a program to determine the sum of the first 1000 prime numbers. 
 */



public class SumOfPrimes {

	/**
	 * @param args
	 */

	public static boolean isPrime(int num){
		for(int i=2; i<num; i++){
			if(num%i == 0){
				return false; 
			}
		}
		return true; 
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		for(int i=2;;i++)
		{
			if(count<1000)
			{
				count=isPrime(i)?count + 1:count;
				sum = isPrime(i)?sum + i:sum;
			}
			else
				break;
		}

		System.out.println(sum);
	}

}
