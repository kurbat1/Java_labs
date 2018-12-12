package liter;

import basis.Document;
import basis.Pages;
import exceptions.WordsException;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

public class Journal extends Pages implements Cloneable {

    public Integer someMethod() {
        if(words == null) throw new WordsException();
        return intro - words.stream().mapToInt(i -> i).sum();
    }

    Journal() {
    }

    public Journal (String name, ArrayList<Integer> words, int intro) {
        this.name = name;
        this.words = words;
        this.intro = intro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        return intro == ((Document) o).getIntro() &&
                Objects.equals(name, ((Document) o).getName()) &&
                Objects.equals(words, ((Document) o).getWords());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, words, intro);
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        Document clone = new Journal(name, new ArrayList<>(words), intro);
        return clone;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" ");
        stringBuilder.append(intro);
        stringBuilder.append(" ");
        stringBuilder.append(words.size());
        words.forEach(it -> {
            stringBuilder.append(" ");
            stringBuilder.append(it);
        });
        return stringBuilder.toString();
    }


    @Override
    public void write(Writer out) throws IOException {
        out.write(toString());
    }
}
