

import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) throws Exception {

//        String in_file = args[0]; // get filename from cmd line
        System.out.println("asdf");

        try {
            // CharStream prints
            CharStream codePointCharStream = CharStreams.fromFileName("./inputs/fibonacci.micro");
            LittleLexer lexer = new LittleLexer(codePointCharStream);


            LittleParser parser = new LittleParser(new CommonTokenStream(lexer));
            parser.addParseListener(new LittleBaseListener());

            // Start parsing
            Vocabulary vocab = parser.getVocabulary();
            System.out.println(vocab);
//            ANTLRFileStream in_stream = fromFileName(in_file);// turn into an antlr CharStream
//            LittleLexer lexer = new LittleLexer(in_stream);
//
//            CommonTokenStream tok_s = new CommonTokenStream(lexer);
//            List<String> tok_list = tok_s.getAllTokens()

//            while(tok_list.hasNext())
//            {
//                cur_tok = tok_list.next()
////              System.out.println("Token Type: " + cur_tok.getType())
//                System.out.println("Value: " + cur_tok.getText())
//            }

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
