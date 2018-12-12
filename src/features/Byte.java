package features;

import basis.Document;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Byte {
    public static <T extends Document> void output(T o, OutputStream out) throws IOException { //T универсальный параметр
        o.output(out);
    }

    public static <T extends Document> void output(List<T> o, OutputStream out) throws IOException {
        for (T t : o) {
            t.output(out);
        }
    }

    public static Document input(InputStream in) throws IOException {
        Document document = Utils.createInstance();
        DataInputStream dataInputStream = new DataInputStream(in);
        document.setName(dataInputStream.readUTF());
        document.setIntro(dataInputStream.readInt());
        ArrayList<Integer> list = new ArrayList<>();
        int listSize = dataInputStream.readInt();
        for (int i = 0; i < listSize; i++) {
            list.add(dataInputStream.readInt());
        }
        document.setWords(list);
        return document;
    }

    public static List<Document> inputArray(InputStream in) throws IOException {
        ArrayList<Document> documents = new ArrayList<>();
        DataInputStream dataInputStream = new DataInputStream(in);
        String docName = dataInputStream.readUTF();
        while (true) {
            Document document = Utils.createInstance();
            document.setName(docName);
            document.setIntro(dataInputStream.readInt());
            ArrayList<Integer> list = new ArrayList<>();
            int listSize = dataInputStream.readInt();
            for (int i = 0; i < listSize; i++) {
                list.add(dataInputStream.readInt());
            }
            document.setWords(list);
            documents.add(document);
            try {
                docName = dataInputStream.readUTF();
            } catch (Exception e) {
                break;
            }
        }
        return documents;
    }
}
