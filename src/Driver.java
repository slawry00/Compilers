// CSCI 468
// Chris Cooper, Spencer Lawry, Matthew Gober

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;

public class Driver {

    public static void main(String[] args) throws Exception {
        String fileName = "inputs/loop.micro";      // set later to args[0] and setup in bash script
        String outputName = "outputs/loop.out";     // set output args[0] + ".out";
        FileWriter myWriter = new FileWriter(outputName);

        try {
            // create the grammar from CharStream interface
            LittleLexer grammar = new LittleLexer(CharStreams.fromFileName(fileName));
            // create the token stream and set channel to 0 to pull tokens instead of default channel
            // (default doesn't pull tokens correctly)
            CommonTokenStream tokens = new CommonTokenStream(grammar, 0);
            tokens.getNumberOfOnChannelTokens();        //iterates through and counts EOF once
            // create list of tokens and utilize the Vocabulary interface to return string associated with token
            List<Token> tokenList = tokens.getTokens();
            Vocabulary vocab = grammar.getVocabulary();
            for(int i=0; i < tokenList.size(); i++){
                int type = tokenList.get(i).getType();

                // EOF is 0, so exclude it from output
                if (type > 0) {
                    String symbol = vocab.getSymbolicName(type);
                    System.out.println("Token Type: " + symbol);
                    System.out.println("Value: " + tokenList.get(i).getText());
                    myWriter.append("Token Type: " + symbol);
                    myWriter.append("Value: " + tokenList.get(i).getText());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}