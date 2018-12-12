package features;

import basis.Document;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void write(Document o, Writer out) throws IOException {
        o.write(out);
    }

    public static void write(List<Document> o, Writer out) throws IOException {
        for (Document document : o) {
            document.write(out);
            out.write(System.getProperty("line.separator"));
        }
    }

    public static Document read(Reader in) {
        Scanner scanner = new Scanner(in);
        Document document = Utils.createInstance();
        document.setName(scanner.next());
        document.setIntro(scanner.nextInt());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int listSize = scanner.nextInt();
        for (int i = 0; i < listSize; i++) {
            arrayList.add(scanner.nextInt());
        }
        document.setWords(arrayList);
        return document;
    }

    public static List<Document> readArray(Reader in) {
        List<Document> list = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        while (scanner.hasNext()) {
            Document document = Utils.createInstance();
            document.setName(scanner.next());
            document.setIntro(scanner.nextInt());
            ArrayList<Integer> arrayList = new ArrayList<>();
            int listSize = scanner.nextInt();
            for (int i = 0; i < listSize; i++) {
                arrayList.add(scanner.nextInt());
            }
            document.setWords(arrayList);
            list.add(document);
            scanner.nextLine();
        }
        return list;
    }


}
