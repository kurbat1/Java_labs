import basis.Document;
import features.Byte;
import features.Serialization;
import features.Text;

import java.io.*;
import java.util.List;

public class test {
    List<Document> documents;

    public test(List<Document> docs) {
        this.documents = docs;
    }

    public void testSymbols(){
        try (FileWriter fileWriter = new FileWriter("output_text")) {
            Text.write(documents.get(0), fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader("output_text")) {
            assert (Text.read(fileReader).equals(documents.get(0)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter("output_text")) {
            Text.write(documents, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader("output_text")) {
            assert (Text.readArray(fileReader).equals(documents));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testSerialization(){

        try (FileOutputStream fileOutputStream = new FileOutputStream("output_serialize")) {
            Serialization.serialize(documents.get(0), fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileOutputStream = new FileInputStream("output_serialize")) {
            assert (Serialization.deserialize(fileOutputStream).equals(documents.get(0)));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("output_serialize")) {
            Serialization.serialize(documents, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileOutputStream = new FileInputStream("output_serialize")) {
            assert (Serialization.deserializeArray(fileOutputStream).equals(documents));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void testBytes(){
        try (FileOutputStream fileOutputStream = new FileOutputStream("output")) {
            Byte.output(documents.get(0), fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileOutputStream = new FileInputStream("output")) {
            assert (Byte.input(fileOutputStream).equals(documents.get(0)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("output")) {
            Byte.output(documents, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileInputStream = new FileInputStream("output")) {
            assert (Byte.inputArray(fileInputStream).equals(documents));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
