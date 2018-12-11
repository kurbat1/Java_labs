package features;

import basis.Document;

import java.util.Comparator;

public class IntroComparator  implements Comparator<Document> {


        @Override
        public int compare(Document o1, Document o2) {
            return Integer.compare(o1.getIntro(), o2.getIntro());
        }



}
