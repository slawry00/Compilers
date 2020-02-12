

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) throws Exception {

        String fileName = args[0]; // get filename from cmd line

        try {
            // read in file for LittleLexer class ----
//            LittleLexer lexer = new LittleLexer(File.(fileName));

            // create list of tokens
//            List list

            // Use lexer.getVocabulary();

            // Print out tokens in list
            for (int i = 0; i < tokens; i++) {
                // implement this to print out the name of the token
//                String currentToken = lexer.getVocabulary.getSymbolicName();
                // print name of token
                System.out.println("Token Type: " + currentTokenName);
                // and print value of token
                System.out.println("Value: " + t.getValue());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // output to output.out
    public static void FileWriter(String content) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.out", true));
        writer.write(content);
        writer.close();
    }
}
