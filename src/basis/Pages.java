package basis;

import liter.Book;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Pages implements Document {
    protected String name;
    protected ArrayList<Integer> words;
    protected int intro;

    @Override
    public void output(OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeUTF(name);
        dataOutputStream.writeInt(intro);
        dataOutputStream.writeInt(words.size());
        for (Integer words : words) {
            dataOutputStream.writeInt(words);
        }
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return new Book(name, new ArrayList<>(words), intro);
    }

    @Override
    public int compareTo(Document o) {
        return this.someMethod() - o.someMethod();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Integer> getWords() {
        return words;
    }

    @Override
    public Integer getWords(int i) {
        return words.get(i);
    }

    @Override
    public void setWords(ArrayList<Integer> words) {
        this.words = words;
    }

    @Override
    public int getIntro() {
        return intro;
    }

    @Override
    public void setIntro(int intro) {
        this.intro = intro;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new IterableParagraph();
    }

    private class IterableParagraph implements Iterator<Integer> {
        Iterator iter = words.iterator();

        @Override
        public boolean hasNext() {
            return iter.hasNext();
        }

        @Override
        public Integer next() {
            return (Integer) iter.next();
        }
    }
}
