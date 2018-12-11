package features;

import basis.Document;

import java.util.Comparator;

public class NameComparator implements Comparator<Document> {
    @Override
    public int compare(Document o1, Document o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
