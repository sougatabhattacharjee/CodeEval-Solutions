package moderate;

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
public class StringRotation {



        /**
         * https://www.codeeval.com/open_challenges/76/
         */




        public static boolean rotation(String s1, String s2){
            String s3 = s1+s1;
            if(s2.length()!=s1.length()  || !s3.contains(s2))
                return false;

            return true;
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            BufferedReader br = null;

            try {

                String sCurrentLine;
                br = new BufferedReader(new FileReader(args[0]));

                while ((sCurrentLine = br.readLine()) != null) {

                    String s1 = sCurrentLine.split(",")[0];
                    String s2 = sCurrentLine.split(",")[1];



                    System.out.println(rotation(s1,s2)?"True":"False");
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

