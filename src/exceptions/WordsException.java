package exceptions;

public class WordsException extends RuntimeException {
    public WordsException(){
        super("Words must not be null");
    }
}


