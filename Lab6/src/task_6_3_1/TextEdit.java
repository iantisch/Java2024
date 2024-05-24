package task_6_3_1;

import java.io.*;

public class TextEdit {
    private TextEdit() {
    }

    final private static TextEdit instance = new TextEdit();

    public static TextEdit getInstance() {
        return instance;
    }

    public String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void countWords(String fileName){
        String content = readFile(fileName);
        String[] words = content.split(" ");
        System.out.println("Number of words in the file " + fileName + " is " + words.length);
    }

    public void writeToFile(String fileName, String content){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void appendToFile(String fileName, String content){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(content);
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
