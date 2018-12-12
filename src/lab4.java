import basis.Document;
import features.IntroComparator;
import features.NameComparator;
import features.Utils;

import java.util.ArrayList;
import java.util.List;

public class lab4 {
    public static void main(String[] args) {
        Document doc1 = Utils.createInstance();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(11);
        doc1.setName("name1");
        doc1.setWords(arrayList1);
        doc1.setIntro(100);

        Document doc2 = Utils.createInstance();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(10);
        doc2.setName("name2");
        doc2.setWords(arrayList2);
        doc2.setIntro(150);

        Document doc3 = Utils.createInstance();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(40);
        arrayList3.add(10);
        doc3.setName("name3");
        doc3.setWords(arrayList3);
        doc3.setIntro(140);

        List<Document> docList = new ArrayList<>();
        docList.add(doc1);
        docList.add(doc2);
        docList.add(doc3);
        docList.sort(new IntroComparator());
        System.out.println(docList);
        docList.sort(new NameComparator());
        System.out.println(docList);

    }
}
