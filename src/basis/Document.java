package basis;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;

public interface Document extends Serializable, Iterable<Integer>, Comparable<Document>, Cloneable {
    void output(OutputStream out) throws IOException;

    void write(Writer out) throws IOException;

    Integer someMethod();

    String getName();

    void setName(String name);

    ArrayList<Integer> getWords();

    Integer getWords(int i);

    void setWords(ArrayList<Integer> words);

    int getIntro();

    void setIntro(int intro);

    Document clone() throws CloneNotSupportedException;

}
