package features;

import basis.Document;
import fablic.BookFactory;
import fablic.Factory;
import liter.NewDocument;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static Factory factory = new BookFactory();
    private static List<Document> createList(List<Document> list) {
        List<Document> newList = new ArrayList<>(list);
        for (Document it : list) {
            try {
                newList.add(it.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return newList;
    }

    public static void setFactory(Factory factory) {
        Utils.factory = factory;
    }

    public static List<Document> sort(List<Document> list) {
        List<Document> newList = Utils.createList(list);
        newList.sort(Comparable::compareTo);
        return newList;
    }


    public static Document createInstance(){
        return factory.createInstance();
    }
    public static Document unmodifiableDocument(Document document){
        return new NewDocument(document);
    }
}
