package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA 14.0
 *
 * @author sougata
 * @date March 08, 2015
 * @brief Application class to test
 */
public class MaxRangeSum {



        /**
         * https://www.codeeval.com/open_challenges/186/
         */

        public static int palindromeCount(int start, int finish) {
            int k = start;
            int returnVal = 0;
            while (k <= finish) { // Changed to <= to consider "finish" too
                int temp = k;
                int r = 0;
                while (temp > 0) {
                    r = 10 * r + temp % 10;
                    temp = temp / 10;
                }
                if (r == k) {
                    returnVal++;
                }
                k++;
            }
            return returnVal;
        }


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            BufferedReader br = null;

            try {

                String sCurrentLine;
                br = new BufferedReader(new FileReader(args[0]));

                while ((sCurrentLine = br.readLine()) != null) {

                    int days = Integer.parseInt(sCurrentLine.split(";")[0]);
                    String gainLoss  = sCurrentLine.split(";")[1];

                    String[] gainLossRecords = gainLoss.split(" ");

                    if(days>gainLossRecords.length)
                        continue;

                    int[] result = new int[gainLossRecords.length-days+1];
                    int sum = 0;

                    for(int i=0;i<=gainLossRecords.length-days;i++)
                    {
                        for(int j=i; j<i+days; j++)
                        {
                            sum+=Integer.parseInt(gainLossRecords[j]);
                        }
                        result[i] = sum;
                        sum=0;

                    }

                    Arrays.sort(result);


                    System.out.println(result[result.length-1]>0?result[result.length-1]:0);

                    System.out.println(">>>>>>>"+palindromeCount(1,7));
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

