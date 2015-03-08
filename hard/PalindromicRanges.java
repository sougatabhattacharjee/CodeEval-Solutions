package hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA 14.0
 *
 * @author sougata
 * @date March 08, 2015
 * @brief Application class to test
 */
public class PalindromicRanges {
    /**
     * https://www.codeeval.com/open_challenges/47/
     */

    private static boolean isPalindrome(int input) {
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
        BufferedReader br = null;

        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader(args[0]));

            while ((sCurrentLine = br.readLine()) != null) {

                int L = Integer.parseInt(sCurrentLine.split(" ")[0]);
                int R = Integer.parseInt(sCurrentLine.split(" ")[1]);

                int interest = 0;
                for (int i = L; i <= R; i++) {
                    for (int j = i; j <= R; j++) {
                        int count = 0;
                        for (int k = i; k <= j; k++) {
                            if (isPalindrome(k)) {
                                count++;
                            }
                        }
                        if (count % 2 == 0)
                            interest++;
                    }
                }
                System.out.println(interest);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
