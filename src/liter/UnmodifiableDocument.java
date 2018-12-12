package liter;

import basis.Document;
import basis.Pages;
import exceptions.WordsException;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class UnmodifiableDocument extends Pages {

    public UnmodifiableDocument(Document doc) {
        this.intro = doc.getIntro();
        this.words = doc.getWords();
        this.name = doc.getName();
    }

    @Override
    public void write(Writer out) throws IOException {
        out.write(toString());
    }

    @Override
    public Integer someMethod() {
        if (words == null) throw new WordsException();
        return intro - words.stream().mapToInt(i -> i).sum();
    }


    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setWords(ArrayList<Integer> words) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setIntro(int intro) {
        throw new UnsupportedOperationException();
    }
}