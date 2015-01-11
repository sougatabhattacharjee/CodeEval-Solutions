package moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * https://www.codeeval.com/open_challenges/130/
 */



public class SumToZero {

	/**
	 * @param args
	 */

	

	public static int combination(Object[]  elements, int K){
		int sum = 0; 
		
		int count = 0;
		
        // get the length of the array
        // e.g. for {'A','B','C','D'} => N = 4
        int N = elements.length;
        
        
        // calculate the possible combinations
        // e.g. c(4,2)
        //c(N,K);
         
        // get the combination by index
        // e.g. 01 --> AB , 23 --> CD
        int combination[] = new int[K];
         
        // position of current index
        //  if (r = 1)              r*
        //  index ==>        0   |   1   |   2
        //  element ==>      A   |   B   |   C
        int r = 0;     
        int index = 0;
         
        while(r >= 0){
            // possible indexes for 1st position "r=0" are "0,1,2" --> "A,B,C"
            // possible indexes for 2nd position "r=1" are "1,2,3" --> "B,C,D"
             
            // for r = 0 ==> index < (4+ (0 - 2)) = 2
            if(index <= (N + (r - K))){
                    combination[r] = index;
                     
                // if we are at the last position print and increase the index
                if(r == K-1){
 
                    //do something with the combination e.g. add to list or print
                	for(int in: combination)
                		sum+=Integer.parseInt(elements[in]+"");
                	
                	if(sum==0)
                		count++;
                	
                	sum=0;
                	
                	index++;               
                }
                else{
                    // select index for next position
                    index = combination[r]+1;
                    r++;                                       
                }
            }
            else{
                r--;
                if(r > 0)
                    index = combination[r]+1;
                else
                    index = combination[0]+1;  
            }          
        }
        
        return count;
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

				String string = sCurrentLine.trim();
				String[] numbers = string.split(",");
	
				combination(numbers,4);
				
				System.out.println(combination(numbers,4));

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
