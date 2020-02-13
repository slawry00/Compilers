

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) throws Exception {

//        String in_file = args[0]; // get filename from cmd line
        System.out.println("asdf");

        try {
            // just use this deprecated class, unless you can find another class that implements CharStream
            // CharStream is an interface...
            ANTLRFileStream in_stream = fromFileName(in_file);// turn into an antlr CharStream
            LittleLexer lexer = new LittleLexer(in_stream);

            CommonTokenStream tok_s = new CommonTokenStream(lexer);
            List<String> tok_list = tok_s.getAllTokens()

            while(tok_list.hasNext())
            {
                cur_tok = tok_list.next()
//              System.out.println("Token Type: " + cur_tok.getType())
                System.out.println("Value: " + cur_tok.getText())
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
