package task_6_3_1;

public class Client {

    public static void main(String[] args) {
        TextEdit textEditor = TextEdit.getInstance();
        String text = textEditor.readFile("Lab6/src/task_6_3_1/MyText.txt");
        System.out.println(text);

        TextEdit textEditor2 = TextEdit.getInstance();
        System.out.println("textEditor == textEditor2: " + (textEditor == textEditor2));

        textEditor2.countWords("Lab6/src/task_6_3_1/MyText.txt");
        textEditor2.appendToFile("Lab6/src/task_6_3_1/MyText.txt", "\nHello world!");
        textEditor2.writeToFile("Lab6/src/task_6_3_1/AddedText.txt", "Hello world!");
    }
}
