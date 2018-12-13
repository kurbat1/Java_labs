import basis.Document;
import liter.Book;
import liter.Journal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
      //  new Thread(() -> System.out.println("Hello world!")).start();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(21);
        Book Book = new Book("Argen", arrayList, 64);
        Book Book2 = new Book();
        try {
            Book2 = (Book) Book.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(Book2.toString());
        ArrayList<Document> documents = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Book act = new Book("Klep", arrayList, 31);
            Journal paper = new Journal("Drier", arrayList, 34);
            documents.add(act);
            documents.add(paper);
        }
        test test = new test(documents);
        test.testBytes();
        test.testSerialization();
        test.testSymbols();
        ArrayList<Book> Books = new ArrayList<>();
        ArrayList<Journal> Journals = new ArrayList<>();
        Map<Integer, List<Document>> methods = new HashMap<>();


        documents.forEach(doc -> {
            System.out.println(doc);
            if (doc instanceof Book) Books.add((Book) doc);
            else if (doc instanceof Journal) Journals.add((Journal) doc);
            Integer res = doc.someMethod();
            methods.computeIfAbsent(res, k -> new ArrayList<>());
            methods.get(res).add(doc);
        });

        Books.forEach(System.out::println);
        Journals.forEach(System.out::println);
    }


}
