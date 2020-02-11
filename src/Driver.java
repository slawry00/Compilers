import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Driver extends LittleBaseListener {
    public static void main(String[] args) throws Exception {

        StringBuilder file = new StringBuilder();

        try (BufferedReader br = new BufferedReader(
                new FileReader("output.out"/* args[0] */))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                file.append(sCurrentLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String tokens = file.toString();
    }
}
