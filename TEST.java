import java.io.*;

public class TEST {


    TEST() {
        try {
            File file = new File("TEST.txt");
            file.createNewFile();

            //FileWriter writer = new FileWriter("TEST.txt", true);
            //writer.write("Hello, World!");
            //writer.close();

            FileReader fr = new FileReader("TEST.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while (br.ready()) {
                String test = br.readLine();
                System.out.println(br);
            }
            
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}