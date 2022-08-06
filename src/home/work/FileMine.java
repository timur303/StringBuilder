package home.work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMine {
    public static void main(String[] args) throws IOException {
        try {
            //fileWriter
            FileWriter fileWriter = new FileWriter("Alphabet.txt");
            fileWriter.write("A a ");
            fileWriter.write("B b ");
            fileWriter.write("C c ");
            fileWriter.write("D d ");
            fileWriter.write("E e ");
            fileWriter.write("F f ");
            fileWriter.write("G g ");
            fileWriter.write("H h ");
            fileWriter.write("I i ");
            fileWriter.write("J j ");
            fileWriter.write("K k ");
            fileWriter.write("L l ");
            fileWriter.write("M m ");
            fileWriter.write("N n ");
            fileWriter.write("O o ");
            fileWriter.write(" P p ");
            fileWriter.write("Q q ");
            fileWriter.write("R r ");
            fileWriter.write("S s ");
            fileWriter.write("T t ");
            fileWriter.write("U u ");
            fileWriter.write("V v ");
            fileWriter.write("W w ");
            fileWriter.write("X x ");
            fileWriter.write("Y y ");
            fileWriter.write("Z z ");
            fileWriter.write("0 ");
            fileWriter.write("1 ");
            fileWriter.write("2 ");
            fileWriter.write("3 ");
            fileWriter.write("4 ");
            fileWriter.write("5 ");
            fileWriter.write("6 ");
            fileWriter.write("7 ");
            fileWriter.write("8 ");
            fileWriter.write("9 ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //filereader
        FileReader fileReader = new FileReader("Alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }
    }
}
