package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Testing {

    /**
     * https://www.codeeval.com/open_challenges/225/
     */


    public static void main(String[] args) {
        BufferedReader br = null;

        try {

            String sCurrentLine;
            String[] parts = null;
            br = new BufferedReader(new FileReader(args[0]));

            while ((sCurrentLine = br.readLine()) != null) {

                sCurrentLine = sCurrentLine.trim().replaceAll("\\s+", "");

                if (sCurrentLine.contains("|")) {
                    parts = sCurrentLine.split(Pattern.quote("|")); // Split on period.
                } else {
                    throw new IllegalArgumentException("String " + sCurrentLine + " does not contain |");
                }

                final String actual = parts[0];
                final String expected = parts[1];

                final char[] actualChars = actual.toCharArray();
                final char[] expectedChars = expected.toCharArray();

                final int minLength = Math.min(actualChars.length, expectedChars.length);
                int counter = 0;

                for (int i = 0; i < minLength; i++) {
                    if (actualChars[i] != expectedChars[i]) {
                        counter++;
                    }
                }

                if (counter > 6) {
                    System.out.println("Critical");
                }
                if (counter <= 6 && counter > 4) {
                    System.out.println("High");
                }
                if (counter <= 4 && counter > 2) {
                    System.out.println("Medium");
                }
                if (counter <= 2 && counter > 0) {
                    System.out.println("Low");
                }
                if (counter == 0) {
                    System.out.println("Done");
                }

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


