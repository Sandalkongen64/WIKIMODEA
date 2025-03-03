import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextManager {

    public void ChangeArticle(){

    }

    public void DeleteArticle(){

    }

    public static String insertLineBreaks(String text, int maxLineLength) {
        StringBuilder result = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i += maxLineLength) {
            if (i + maxLineLength < length) {
                result.append(text, i, i + maxLineLength).append("<br>");
            } else {
                result.append(text, i, length);
            }
        }
        return result.toString();
    }
    public TextManager(){
        StringBuilder test = new StringBuilder();

        try {
            File file = new File("TEST.txt");
            file.createNewFile();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String line = br.readLine();
                test.append(insertLineBreaks(line, 100)).append("<br>");
            }


            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel haha = new JLabel("<html>" + test.toString() + "</html>");
        haha.setFont(new Font("Arial", Font.PLAIN, 30));
    }
}

